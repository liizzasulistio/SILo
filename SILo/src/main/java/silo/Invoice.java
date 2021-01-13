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
public class Invoice 
{
    private int InvoiceNumber; // PRIMARY KEY
    private int PurchaseOrderNumber_FK; // FOREIGN KEY from Order table 
    private String InvoiceCustomerName; // Supplier -> Customer
    private String InvoiceStatus;
	
    public int getInvoiceNumber() { return InvoiceNumber; }
    public void setInvoiceNumber(int InvoiceNumber) { this.InvoiceNumber = InvoiceNumber; }
	
    public int getPurchaseOrderNumber_FK() { return PurchaseOrderNumber_FK; }
    public void setPurchaseOrderNumber_FK(int PurchaseOrderNumber_FK) { this.PurchaseOrderNumber_FK = PurchaseOrderNumber_FK; }
	
    public String getInvoiceSupplierName() {return InvoiceCustomerName; }
    public void setInvoiceSupplierName(String InvoiceCustomerName) { this.InvoiceCustomerName = InvoiceCustomerName; }
	
    public String getInvoiceStatus() { return InvoiceStatus; }
    public void setInvoiceStatus(String InvoiceStatus) { this.InvoiceStatus = InvoiceStatus; }
}
