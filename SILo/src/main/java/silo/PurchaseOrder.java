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
public class PurchaseOrder {
    private int PurchaseOrderNumber; // PRIMARY KEY
    private String PurchaseOrderDate;

    public int getPurchaseOrderNumber() { return PurchaseOrderNumber; }
    public void setPurchaseOrderNumber(int PurchaseOrderNumber) { this.PurchaseOrderNumber = PurchaseOrderNumber; }
	
    public String getPurchaseOrderDate() { return PurchaseOrderDate; }
    public void setPurchaseOrderDate(String PurchaseOrderDate) { this.PurchaseOrderDate = PurchaseOrderDate; }
    
}
