package com.game.dnd.entity.hands;

import com.game.dnd.superklasse.Item;

public class LeftHand {

    // Attribute
    private Item item;
    String info = "Iam the Left Hand";
    public Boolean isWeapon;


    //Konstruktoren
    public LeftHand(Item item) {
        this.item = item;
    }

    //Methoden

    //Getter Setter
    public Item getItemInLeftHand(){
        return this.item;
    };

    public void setItemInLeftHand(Item item){
        this.item = item;
    };


}
