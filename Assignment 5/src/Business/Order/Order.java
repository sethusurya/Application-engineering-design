/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;

import Business.DeliveryMan.DeliveryMan;
import Business.Restaurant.MenuItem;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author sethu
 */
public class Order {
    private int id;
    private static int count = 1;
    private Date orderTime;
    private String status;
    private Date deliveryTime;
    private DeliveryMan deliveryMan; // assign or null
    private String comment; // can be null
    private String restaurantName; // select the restaurant name
    private ArrayList<MenuItem> orderList; // can be repeated
    
    public Order(){
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Order.count = count;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public ArrayList<MenuItem> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<MenuItem> orderList) {
        this.orderList = orderList;
    }
    
    @Override
    public String toString() {
        return String.valueOf(count);
    }
    
    
}
