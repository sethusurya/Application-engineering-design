/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author sethu
 */
public class OrderDirectory {
    
    private ArrayList<Order> orderDirectory;
    
    public OrderDirectory(){
        orderDirectory = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(ArrayList<Order> orderDirectory) {
        this.orderDirectory = orderDirectory;
    }
    
    public ArrayList<Order> addOrder(Order newOrder){
        orderDirectory.add(newOrder);
        return orderDirectory;
    }
    
    public void removeOrder(Order order){
        orderDirectory.remove(order);
    }
    
    public ArrayList<Order> modifyOrder(int index, Order newOrder){
        orderDirectory.set(index, newOrder);
        return orderDirectory;
    }
}
