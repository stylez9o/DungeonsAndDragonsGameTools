package com.game.dnd.entity;

public class Header {
    // Attribute
    private String volk;
    private String name;
    private String rasse;
    

    // Konstruktor
    public Header(String volk, String name, String rasse) {
            this.volk = volk;
            this.name = name;
            this.rasse = rasse;
    }


    public String getVolk() {
        return volk;
    }


    public void setVolk(String volk) {
        this.volk = volk;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getRasse() {
        return rasse;
    }


    public void setRasse(String rasse) {
        this.rasse = rasse;
    }

    // Methoden
    

}
