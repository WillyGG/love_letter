/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package love_letter;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import love_letter.Cards.*;

/**
 *
 * @author Zerenity
 */
public class DeckTest {
    protected Deck instance;
    
    public DeckTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Deck();
    }
    
    @After
    public void tearDown() {
        
    }

    /**
     * Test of get_deck_size method, of class Deck.
     */
    @Test
    public void testGet_deck_size() {
        System.out.println("get_deck_size");
        int expResult = 16;
        int result = this.instance.get_deck_size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    // Test shuffling method.
    @Test
    public void test_shuffling() {
        System.out.println("Testing Shuffling...");
        Deck another_deck = new Deck();
        Card[] extracted_deck_1 = extract_deck(instance);
        Card[] extracted_deck_2 = extract_deck(another_deck);
        assertFalse(Arrays.equals(extracted_deck_1, extracted_deck_2));
        System.out.println(Arrays.toString(extracted_deck_1));
        System.out.println(Arrays.toString(extracted_deck_2));
        
    }
    
    private Card[] extract_deck(Deck deck) {
        Card[] extracted_deck = new Card[ deck.get_deck_size() ];
        int current_ind = 0;
        while (!deck.empty()) {
           extracted_deck[current_ind] = deck.pop();
           current_ind ++;
        }
        return extracted_deck;
    }
    
}
