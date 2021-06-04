package com.game.dnd.npc.monster;

import com.game.dnd.npc.monster.hands.RightHand;
import com.game.dnd.objectSuperclass.Entity;
import com.game.dnd.npc.monster.hands.LeftHand;
import com.game.dnd.npc.Header;

public class Monster extends Entity{

    


    
    public void oneHandIsFull(LeftHand left, RightHand right){

        if(left != null & left.isWeapon) {
            setAttackValue(left.item.value1);
        }
        if(left != null & !right.isWeapon) {
            setAttackValue(right.item.value1);
        }
        if(right != null & right.isWeapon) {
            setAttackValue(right.item.value1);
        }
        if(right != null & !right.isWeapon) {
            setAttackValue(right.item.value1);
        }

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
