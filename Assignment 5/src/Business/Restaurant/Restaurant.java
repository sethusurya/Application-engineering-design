/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String name; // keep the restaurant name unique
    private ArrayList<MenuItem> menu;

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }

    public Restaurant() {
     menu = new ArrayList<MenuItem>();   
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Boolean checkUniqueMenuItemName(String name) {
        for(MenuItem m: getMenu()) {
            if (m.getName().toLowerCase().equals(name.toLowerCase())) {
                return false;
            }
        }
        return true;
    }
    
    public MenuItem findMenuItem(String menuItemName){
        for(MenuItem m: menu) {
            if (m.getName().toLowerCase().equals(menuItemName.toLowerCase())) {
                return m;
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
