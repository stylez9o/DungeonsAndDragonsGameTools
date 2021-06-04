package com.game.dnd.superklasse;

public class Item {

    // Attribute
    Integer price; //Wert in Münzen
    private Integer value1; // bei Waffen Angriff
    private Integer value2; // bei Tränken Heilungswert
    String description; // Beschreibung

    // Konstruktoren
    public Item(Integer price, Integer value1, Integer value2, String description) {
        this.price = price;
        this.value1 = value1;
        this.value2 = value2;
        this.description = description;
    }

    // Konstruktor 2 für Tränke Essen etc.
    public Item(Integer price, Integer value2, String description) {
        this.price = price;
        this.value2 = value2;
        this.description = description;
    }

 
    // Methoden
    
    
    //Getter Setter
    public Integer getValue1() {
        return value1;
    }


    public void setValue1(Integer value1) {
        this.value1 = value1;
    }


    public Integer getValue2() {
        return value2;
    }

  
    public void setValue2(Integer value2) {
        this.value2 = value2;
    }
}
