/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package love_letter;

import love_letter.Cards.Card;
import love_letter.Cards.Guard;
import love_letter.Cards.Priest;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Zerenity
 */
public class HandTest {
    Hand instance;
    
    public HandTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Hand();
    }

    /**
     * Test of add method, of class Hand.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Guard newCard = new Guard(null);
        boolean expResult = true;
        boolean result = instance.add(newCard);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testOverAdd() {
        System.out.println("Adding more than allowed");
        boolean expResult = false;
        boolean result = true;
        for (int x = 0; x < 3; x ++) {
            result = instance.add(new Guard(null));
        }
        assertEquals(expResult, result);
    }

    /**
     * Test of playCard method, of class Hand.
     */
    
    // TODO Fix this
    @Test
    public void testPlayCard() {
        System.out.println("playCard");
        Guard testGuard = new Guard(null);
        instance.add(testGuard);
        Card result = instance.playCard("Guard");
        assertEquals(testGuard, result);

    }
    
    @Test
    public void testPlayCardNull() {
        System.out.println("Playing card not in hand");
        Guard testGuard = new Guard(null);
        instance.add(testGuard);        
        Card result = instance.playCard("Priest");
        assertNull(result);
    }
}
