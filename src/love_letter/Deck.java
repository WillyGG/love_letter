/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package love_letter;

/**
 *
 * @author Zerenity
 */
import java.util.Stack;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import love_letter.Cards.*;

public class Deck extends Stack<Card> {
    //private Stack<Card> deck = new Stack<>();
    private HashMap<String, Card> card_names = new HashMap<>();
    private HashMap<String, Integer> card_numbers = new HashMap<>();
    private HashMap<String, String> card_images = new HashMap<>();
    private final int deck_size = 16;
    
    public Deck() {
        this.populate_card_images();
        this.populate_card_names();
        this.populate_card_numbers();
        this.populate_deck();
    }
    
    // TODO fukin test this shit
    // Populates this.deck with shuffled deck.
    private void populate_deck() {
        LinkedList<Card> temp_deck = new LinkedList<>();
        this.card_numbers.forEach( (key, value) -> populate_temp_deck(key, value, temp_deck) );
        Collections.shuffle(temp_deck);
        while (!temp_deck.isEmpty()) {
            Card toPush = temp_deck.pop();
            this.push(toPush);
        }
    }
    
    /* Adds a new instance to temp_deck, based on how many are required, based on 
       this.card_numbers */
    private void populate_temp_deck(String key, int value, List<Card> temp_deck) {
        for (int x = 0; x < value; x ++) {
            Card c = this.card_names.get(key);
            temp_deck.add(c);
        }
    }
    
    // Populates with the names of the cards and instanciates classes
    private void populate_card_names() {
        this.card_names.put("Guard", new Guard( this.card_images.get("Guard") ));
        this.card_names.put("Priest", new Priest( this.card_images.get("Priest") ));
        this.card_names.put("Baron", new Baron(this.card_images.get("Baron") ));
        this.card_names.put("Handmaid", new Handmaid( this.card_images.get("Handmaid") ));
        this.card_names.put("Prince", new Prince( this.card_images.get("Prince") ));
        this.card_names.put("King", new King( this.card_images.get("King") ));
        this.card_names.put("Countess", new Countess( this.card_images.get("Countess") ));
        this.card_names.put("Princess", new Princess( this.card_images.get("Princess") ));
    }
    
    // populates with the number of each card required in the deck.
    // Condense this and the one above into just one list, becuase you're not this retarded.
    private void populate_card_numbers() {
        this.card_numbers.put("Guard", 5);
        this.card_numbers.put("Priest", 2);
        this.card_numbers.put("Baron", 2);
        this.card_numbers.put("Handmaid", 2);
        this.card_numbers.put("Prince", 2);
        this.card_numbers.put("King", 1);
        this.card_numbers.put("Countess", 1);
        this.card_numbers.put("Princess", 1);
    }
    
    // populates with file path for image
    private void populate_card_images() {
        this.card_images.put("Guard", " ");
        this.card_images.put("Priest", " ");
        this.card_images.put("Baron", " ");
        this.card_images.put("Handmaid", " ");
        this.card_images.put("Prince", "" );
        this.card_images.put("King", " ");
        this.card_images.put("Countess", " ");
        this.card_images.put("Princess", " ");
    }
    
    public int get_deck_size() {
        return this.deck_size;
    }
    
}
