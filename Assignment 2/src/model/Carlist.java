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
    
    public ArrayList<Car> addCar(Car newCar){
        carArray.add(newCar);
        return carArray;
    }
    
    public void add(Car newCar){
        carArray.add(newCar);
    }
    
    public void remove(Car newCar){
        carArray.remove(newCar);
    }
    
    public ArrayList<Car> removeCar(int index){
        carArray.remove(index);
        return carArray;
    }
    
    public ArrayList<Car> modifyCar(int index, Car newCar){
        carArray.set(index, newCar);
        return carArray;
    }
    
    public Car getCar(int index){
        return carArray.get(index);
    }
    
}
