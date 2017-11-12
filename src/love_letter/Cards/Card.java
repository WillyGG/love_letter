/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package love_letter.Cards;

import java.util.Objects;

/**
 *
 * @author Zerenity
 */
public abstract class Card {
    protected String name;
    protected int value;
    protected String desc;
    protected String pic;
    
    public Card(String name_a, int value_a, String desc_a, String pic_a) {
        this.name = name_a;
        this.value = value_a;
        this.desc = desc_a;
        this.pic = pic_a;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public String getDesc() {
        return this.desc;
    }
    
    @Override
    public int hashCode() {
        int hash;
        hash = this.name.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Card other = (Card) obj;
        return Objects.equals(this.name, other.name);
    }
    
    @Override
    public String toString() {
        return this.name;
    }
}