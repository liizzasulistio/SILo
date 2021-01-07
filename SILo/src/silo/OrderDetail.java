package silo;

public class OrderDetail 
{
	private int OrderID; //PRIMARY KEY
	private int PurchaseOrderNumber_FK; //FOREIGN KEY from PurchaseOrder table
	private int ItemID_FK; //FOREIGN KEY from Item table
	private int ItemQuantity; //quantities of ordered items, also used to check the amount of items stock
	
	public int getOrderID() { return OrderID; }
	public void setOrderID(int OrderID) { this.OrderID = OrderID; }
	
	public int getPurchaseOrderNumber_FK() { return PurchaseOrderNumber_FK; }
	public void setPurchaseOrderNumber_FK(int PurchaseOrderNumber_FK) { this.PurchaseOrderNumber_FK = PurchaseOrderNumber_FK; }
	
	public int getItemID_FK() { return ItemID_FK; }
	public void setItemID_FK(int ItemID_FK) { this.ItemID_FK = ItemID_FK; }
	
	public int getItemQuantity() { return ItemQuantity; }
	public void setItemQuantity(int ItemQuantity) { this.ItemQuantity = ItemQuantity; }	
}
