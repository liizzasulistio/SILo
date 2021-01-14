/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author Waldo
 */
public class Order {
    private Integer orderID;
    private Date orderDate;
    private Date deliveryDate;
    private ArrayList<Map<Item, Integer>> entries = new ArrayList<>();

    public Integer getOrderID() {
        return orderID;
    }

    public Date getOrderDate() {
        return orderDate;
    }
    
    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public ArrayList<Map<Item, Integer>> getEntries() {
        return entries;
    }
    
}
