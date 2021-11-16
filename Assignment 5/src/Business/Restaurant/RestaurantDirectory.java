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
public class RestaurantDirectory {
    
    ArrayList<Restaurant> restaurantDirectory;
    
    public RestaurantDirectory() {
        restaurantDirectory = new ArrayList<Restaurant>();
    }

    public ArrayList<Restaurant> getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(ArrayList<Restaurant> restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }
    
    public ArrayList<Restaurant> addRestaurant(Restaurant newRestaurant){
        restaurantDirectory.add(newRestaurant);
        return restaurantDirectory;
    }
    
    public ArrayList<Restaurant> removeRestaurant(Restaurant newRestaurant){
        restaurantDirectory.remove(newRestaurant);
        return restaurantDirectory;
    }
}
