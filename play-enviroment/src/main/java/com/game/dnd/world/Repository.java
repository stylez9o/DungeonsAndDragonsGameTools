package com.game.dnd.world;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.game.dnd.npc.monster.Monster;
import com.game.dnd.objectSuperclass.Entity;
import com.game.dnd.superklasse.Item;

public class Repository {
    // TODO  Listen für Items / Waffen / Spieler / Monster etc eintragen.

    List<Item> itemList = new ArrayList<Item>();
    List<Character> characterList = new ArrayList<Character>();
    List<Monster> monsterList = new ArrayList<Monster>();

    List<Entity> deadList = new LinkedList<Entity>();

    
}
