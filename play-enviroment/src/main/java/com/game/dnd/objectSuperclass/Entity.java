package com.game.dnd.objectSuperclass;

import com.game.dnd.entity.*;
import com.game.dnd.entity.hands.LeftHand;
import com.game.dnd.entity.hands.RightHand;

public class Entity {
    
        // Attribute

        Avatar avatar; // Ein Bild des Characters
        Header header; // Kopfinformationen(Volk, Name, Rasse)
        Attribute attribute;
        Faehigkeiten faehigkeiten;
    
        private Integer attackValue;
        Integer rk; // Ruestungsklasse
        Integer ini; // Initiative
        Integer br; // Bewegungsrate
        Integer trefferpunkte; // Lebenspunkte
    
        Inventar inventar;  // Inventar des Characters
    
        Informationen informationen;
    
        LeftHand lefthand;
    
        RightHand righthand;
    

}
