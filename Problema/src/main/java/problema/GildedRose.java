package problema;


import java.util.ArrayList;
import java.util.List;

public class GildedRose {

    private static List<Item> items = null;

    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));

        for(int j=0;j<10;j++){
            items = updateQuality(items);
            for(int i=0;i<items.size();i++){
            System.out.println(items.get(i).getName()+" "+ items.get(i).getSellIn()+" "+ items.get(i).getQuality());    
            }
        }
    }

    public static List<Item> updateQuality(List<Item> itemsParameter) {
        List<Item> newItems = new ArrayList<Item>();
        for (int i = 0; i < itemsParameter.size(); i++) {
            newItems.add(selectCategory(itemsParameter.get(i)));
        }
        return newItems;
    }

    public static Item selectCategory(Item item) {
        Item newItem;
        switch (item.getName()) {
            case "Aged Brie":
                newItem = updateAgedBrie(item);
                break;
            case "Sulfuras, Hand of Ragnaros":
                newItem = updateSulfuras(item);
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                newItem = updateBackstage(item);
                break;
            case "Conjured Mana Cake":
                newItem = updateConjured(item);
                break;
            default:
                newItem = updateDefault(item);
        }
       return newItem;
    }           
        

    public static Item updateAgedBrie(Item item) {
        if (item.getQuality()<50) item.setQuality(item.getQuality() + 1);
        if (item.getSellIn()>0) item.setSellIn(item.getSellIn() - 1);
        return item;
    }

    public static Item updateSulfuras(Item item) {
        return item;
    }

    public static Item updateBackstage(Item item) {
        if (item.getSellIn()==0) {
            item.setQuality(0);
        }
        if (item.getSellIn()<=5 && item.getSellIn()>0) {
            item.setQuality(item.getQuality() + 3);
            item.setSellIn(item.getSellIn() - 1);
        }
        if (item.getSellIn()<10 && item.getSellIn()>5) {
            item.setQuality(item.getQuality() + 2);
            item.setSellIn(item.getSellIn() - 1);
        }
        if (item.getSellIn()>=10) {
            item.setQuality(item.getQuality() + 1);
            item.setSellIn(item.getSellIn() - 1);
        }
        return item;
    }

    public static Item updateConjured(Item item) {
        if (item.getSellIn()>0) {
            item.setQuality(item.getQuality() - 2);
            item.setSellIn(item.getSellIn() - 1);
        }
        else {
            item.setQuality(0);
        } 
        return item;
    }

    public static Item updateDefault(Item item) {
        if (item.getSellIn()>0) {
            item.setQuality(item.getQuality() - 1);
            item.setSellIn(item.getSellIn() - 1);
        }
        else {
            item.setQuality(0);
        } 
        return item;
    }

}
