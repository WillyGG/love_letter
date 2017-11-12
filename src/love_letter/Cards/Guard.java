/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package love_letter.Cards;

/**
 *
 * @author Zerenity
 */
public class Guard extends Card {    
    public Guard(String pic_path) {
        super("Guard", 1, 
              "Guess the card in an opponent's hand. If you are correct they are out of the round",
              pic_path);
    }
}
