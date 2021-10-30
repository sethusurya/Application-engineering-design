package model;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sethu
 */
public class Community {
    private String name;
    private ArrayList<House> housesList;
    
    public Community(){
        this.housesList = new ArrayList<House>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<House> getHousesList() {
        return housesList;
    }

    public void setHousesList(ArrayList<House> housesList) {
        this.housesList = housesList;
    }
    
    @Override
    public String toString(){ // for community table in city
        return name;
    }

    public ArrayList<House> add(House newHouse) {
        ArrayList<House> newHousesList = housesList;
        newHousesList.add(newHouse);
        return newHousesList;
    }
    
}
