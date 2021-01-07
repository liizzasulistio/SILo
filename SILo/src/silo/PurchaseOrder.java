package silo;

public class PurchaseOrder 
{
	private int PurchaseOrderNumber; // PRIMARY KEY
	private String PurchaseOrderDate;

	public int getPurchaseOrderNumber() { return PurchaseOrderNumber; }
	public void setPurchaseOrderNumber(int PurchaseOrderNumber) { this.PurchaseOrderNumber = PurchaseOrderNumber; }
	
	public String getPurchaseOrderDate() { return PurchaseOrderDate; }
	public void setPurchaseOrderDate(String PurchaseOrderDate) { this.PurchaseOrderDate = PurchaseOrderDate; }
}
