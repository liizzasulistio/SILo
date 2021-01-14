/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silo;

import java.util.ArrayList;

/**
 *
 * @author Waldo
 */
public class Database {
    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    private ArrayList<Invoice> invoices = new ArrayList<>();
    private ArrayList<DeliveryNote> deliveryNotes = new ArrayList<>();
    private ArrayList<Package> packages = new ArrayList<>();

    public ArrayList<Item> getItems() {
        return items;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }

    public ArrayList<DeliveryNote> getDeliveryNotes() {
        return deliveryNotes;
    }

    public ArrayList<Package> getPackages() {
        return packages;
    }
    
}
