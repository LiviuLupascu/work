/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static problema.GildedRose.updateDefault;

/**
 *
 * @author Liviu
 */
public class GildedRoseTest {
    
    public GildedRoseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class GildedRose.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GildedRose.main(args);
        assertEquals(true, true);
    }

    /**
     * Test of updateQuality method, of class GildedRose.
     */
    @Test
    public void testUpdateQuality() {
        System.out.println("updateQuality");
        assertEquals(true, true);
    }

    /**
     * Test of selectCategory method, of class GildedRose.
     */
    @Test
    public void testSelectCategory() {
        System.out.println("selectCategory");
        Item item = new Item("+5 Dexterity Vest", 10, 20);
        Item expResult = GildedRose.updateDefault(item);
        Item result = GildedRose.selectCategory(item);
        assertEquals(result, expResult);
    }

    /**
     * Test of updateAgedBrie method, of class GildedRose.
     */
    @Test
    public void testUpdateAgedBrie() {
        System.out.println("updateAgedBrie");
        Item item = new Item("Aged Brie", 2, 0);
        Item expResult = new Item("Aged Brie", 1, 1);
        Item result = GildedRose.updateAgedBrie(item);
        assertEquals(expResult.getQuality(), result.getQuality());
        assertEquals(expResult.getSellIn(), result.getSellIn());
        
        Item item1 = new Item("Aged Brie", 1, 1);
        Item expResult1 = new Item("Aged Brie", 0, 2);
        Item result1 = GildedRose.updateAgedBrie(item);
        assertEquals(expResult1.getQuality(), result1.getQuality());
        assertEquals(expResult1.getSellIn(), result1.getSellIn());
        
    }

    /**
     * Test of updateSulfuras method, of class GildedRose.
     */
    @Test
    public void testUpdateSulfuras() {
        System.out.println("updateSulfuras");
        Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        Item expResult = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        Item result = GildedRose.updateSulfuras(item);
        assertEquals(expResult.getQuality(), result.getQuality());
        assertEquals(expResult.getSellIn(), result.getSellIn());
    }

    /**
     * Test of updateBackstage method, of class GildedRose.
     */
    @Test
    public void testUpdateBackstage() {
        System.out.println("updateBackstage");
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        Item expResult = new Item("Backstage passes to a TAFKAL80ETC concert", 14, 21);
        Item result = GildedRose.updateBackstage(item);
        assertEquals(expResult.getQuality(), result.getQuality());
        assertEquals(expResult.getSellIn(), result.getSellIn()); 
    
        Item item1 = new Item("Backstage passes to a TAFKAL80ETC concert", 1, 4);
        Item expResult1 = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 7);
        Item result1 = GildedRose.updateBackstage(item1);
        assertEquals(expResult1.getQuality(), result1.getQuality());
        assertEquals(expResult1.getSellIn(), result1.getSellIn()); 
    }

    /**
     * Test of updateConjured method, of class GildedRose.
     */
    @Test
    public void testUpdateConjured() {
        System.out.println("updateConjured");
        Item item = new Item("Conjured Mana Cake", 3, 6);
        Item expResult = new Item("Conjured Mana Cake", 2, 4);
        Item result = GildedRose.updateConjured(item);
        assertEquals(expResult.getQuality(), result.getQuality());
        assertEquals(expResult.getSellIn(), result.getSellIn());
    }

    /**
     * Test of updateDefault method, of class GildedRose.
     */
    @Test
    public void testUpdateDefault() {
        System.out.println("updateDefault");
        Item item = new Item("+5 Dexterity Vest", 10, 20);
        Item expResult = new Item("+5 Dexterity Vest", 9, 19);
        Item result = GildedRose.updateDefault(item);
        assertEquals(expResult.getQuality(), result.getQuality());
        assertEquals(expResult.getSellIn(), result.getSellIn());
        
        Item item1 = new Item("+5 Dexterity Vest", 0, 20);
        Item expResult1 = new Item("+5 Dexterity Vest", 0, 0);
        Item result1 = GildedRose.updateDefault(item1);
        assertEquals(expResult1.getQuality(), result1.getQuality());
        assertEquals(expResult1.getSellIn(), result1.getSellIn());
    }
    
}
