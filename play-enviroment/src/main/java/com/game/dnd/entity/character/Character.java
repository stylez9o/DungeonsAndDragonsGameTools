package com.game.dnd.entity.character;

import com.game.dnd.superklasse.Item;
import com.game.dnd.objectSuperclass.Entity;
import com.game.dnd.entity.Header;
import com.game.dnd.entity.hands.LeftHand;
import com.game.dnd.entity.hands.RightHand;

public class Character extends Entity{

    


    
    public void oneHandIsUsed(LeftHand left, RightHand right){


        // muss umgeschrieben werden damit erkannt wird ob links oder rechts oder beide eine waffe tragen mit anriffswerten

        // if(left != null & left.isWeapon) {
        //     setAttackValue(left.getItemInLeftHand().getValue1());
        // }
        // if(left != null & !right.isWeapon) {
        //     setAttackValue(right.getItemInRightHand().getValue1());
        // }

        // if(right != null & right.isWeapon) {
        //     setAttackValue(right.getItemInRightHand().getValue1());
        // }
        // if(right != null & !right.isWeapon) {
        //     setAttackValue(right.item.value1);
        // }

        /*TODO muss noch ergänzt werden mit Methoden:
            Kämpfen, um zu ermitteln(würfeln)
        */


    }

    // Getter Setter
    public Integer getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(Integer attackValue) {
        this.attackValue = attackValue;
    }


}
