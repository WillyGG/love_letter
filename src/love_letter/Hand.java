/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package love_letter;

import love_letter.Cards.Card;

/**
 *
 * @author Zerenity
 */
class Hand {
    Card[] hand = new Card[2];
    
    public Hand() {
        for (int ind = 0; ind < this.hand.length; ind ++) {
            hand[ind] = null;
        }
    }
    
    private boolean isEmpty() {
        for (Card c : this.hand) {
            if (c != null) {
                return false;
            }
        }
        return true;
    }
    
    private void displayHand() {
        for (Card c : this.hand) {
            if (c != null) {
                String toPrint = c.toString();
                System.out.println(toPrint);
            }
        }
    }
    
    
    public boolean add (Card newCard) {
        for (int ind = 0; ind < this.hand.length; ind ++) {
            if (this.hand[ind] == null) {
                this.hand[ind] = newCard;
                return true;
            }
        }
        this.displayHand();
        return false;
    }
    
    // WRITE A FUKIN TEST FOR THIS   
    public Card playCard(String checkName) {
        Card toReturn;
        if ((checkName == null) || this.isEmpty()) {
            return null;
        }
        for (int ind = 0; ind < this.hand.length; ind ++) {
            if (!(this.hand[ind] == null) && checkName.equals(this.hand[ind].toString())) {
                toReturn = this.hand[ind];
                this.hand[ind] = null;
                return toReturn;
            }
        }
        return null;
    }
    
}
