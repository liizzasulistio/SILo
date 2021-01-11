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
public class DeliveryNote {
    private int DeliveryNoteNumber; //PRIMARY KEY
	private String DeliveryNoteStatus;
	private String DeliveryNoteDescription;
	private int CustomerID_FK; //FOREIGN KEY from Customer table
	private int InvoiceNumber_FK; //FOREIGN KEY from Invoice table
	private int PurchaseOrderNumber_FK; //FOREIGN KEY from PurchasOrder table
	
	public int getDeliveryNoteNumber() { return DeliveryNoteNumber; }
	public void setDeliveryNoteNumber(int DeliveryNoteNumber) { this.DeliveryNoteNumber = DeliveryNoteNumber; }
	
	public String getDeliveryNoteStatus() { return DeliveryNoteStatus; }
	public void setDeliveryNoteStatus(String DeliveryNoteStatus) { this.DeliveryNoteStatus = DeliveryNoteStatus; }
	
	public String getDeliveryNoteDescription() { return DeliveryNoteDescription; }
	public void setDeliveryNoteDescription(String DeliveryNoteDescription) { this.DeliveryNoteDescription = DeliveryNoteDescription; }

	public int getCustomerID_FK() { return CustomerID_FK; }
	public void setCustomerID_FK(int CustomerID_FK) { this.CustomerID_FK = CustomerID_FK; }
	
	public int getInvoiceNumber_FK() { return InvoiceNumber_FK; }
	public void setInvoiceNumber_FK(int InvoiceNumber_FK) { this.InvoiceNumber_FK = InvoiceNumber_FK; }
	
	public int getPurchaseOrderNumber_FK() { return PurchaseOrderNumber_FK; }
	public void setPurchaseOrderNumber_FK(int PurchaseOrderNumber_FK) { this.PurchaseOrderNumber_FK = PurchaseOrderNumber_FK;}
    
}
