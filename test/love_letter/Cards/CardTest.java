/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package love_letter.Cards;

import love_letter.Cards.Guard;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Zerenity
 */
public class CardTest {
    Guard testGuard;
    
    public CardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        // Using Guard to test abstract class.
        testGuard = new Guard(null);
    }

    /**
     * Test of getName method, of class Card.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Guard";
        String result = testGuard.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getValue method, of class Card.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        int expResult = 1;
        int result = testGuard.getValue();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDesc method, of class Card.
     */
    @Test
    public void testGetDesc() {
        System.out.println("getDesc");
        String expResult = "Guess the card in an opponent's hand. If you are correct they are out of the round";
        String result = testGuard.getDesc();
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class Card.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        int expResult = "Guard".hashCode();
        int result = testGuard.hashCode();
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class Card.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Guard equalGuard = new Guard(null);
        boolean expResult = true;
        boolean result = testGuard.equals(equalGuard);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Guard";
        String result = testGuard.toString();
        assertEquals(expResult, result);
    }

    // TODO
    // Change guard to this, and use this to implement test, rather than guard.
    /*
    public class CardImpl extends Card {

        public CardImpl() {
            super("", 0, "", "");
        }
    }
    */
}
