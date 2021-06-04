package com.game.dnd.entity.hands;

import com.game.dnd.superklasse.Item;

public class RightHand {

    // Attribute
    private Item item;
    String info = "Iam the Right Hand";
    public Boolean isWeapon;


    //Konstruktoren
    public RightHand(Item item) {
        this.item = item;
    }

    //Methoden

    //Getter Setter
    public Item getItemInRightHand(){
        return this.item;
    };

    public void setItemInRightHand(Item item){
        this.item = item;
    };


}
