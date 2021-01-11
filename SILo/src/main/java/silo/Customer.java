/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silo;

/**
 *
 * @author liizzasulistio
 */
public class Customer 
{
    private int CustomerID; //PRIMARY KEY
    private String CustomerName;
    private String CustomerEmailAddress;
	
    public int getCustomerID() { return CustomerID; }
    public void setCustomerID(int CustomerID) { this.CustomerID = CustomerID; }
	
    public String getCustomerName() { return CustomerName; }
    public void setCustomerName(String CustomerName) { this.CustomerName = CustomerName; }
	
    public String getCustomerEmailAddress() { return CustomerEmailAddress; }
    public void setCustomerEmailAddress(String CustomerEmailAddress) { this.CustomerEmailAddress = CustomerEmailAddress; }
}
