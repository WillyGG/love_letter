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
public class Countess extends Card {
    public Countess (String pic_path) {
        super("Countess", 7,
              "You must discard this card if you have a Prince or a King in your hand.",
              pic_path);
    }
}
