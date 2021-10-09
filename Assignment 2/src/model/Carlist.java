/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Sethu
 */
public class Carlist {
    
    private ArrayList<Car> carArray;
    
    public Carlist () {
        this.carArray = new ArrayList<Car>();
    }

    public ArrayList<Car> getCarArray() {
        return carArray;
    }

    public void setCarArray(ArrayList<Car> carArray) {
        this.carArray = carArray;
    }
    
}
