package silo;

public class Invoice
{
	private int InvoiceNumber; //PRIMARY KEY
	private int PurchaseOrderNumber_FK; //FOREIGN KEY from Order Table
	private String InvoiceSupplierName;
	private String InvoiceStatus;
	
	public int getInvoiceNumber() { return InvoiceNumber; }
	public void setInvoiceNumber(int InvoiceNumber) { this.InvoiceNumber = InvoiceNumber; }
	
	public int getPurchaseOrderNumber_FK() { return PurchaseOrderNumber_FK; }
	public void setPurchaseOrderNumber_FK(int PurchaseOrderNumber_FK) { this.PurchaseOrderNumber_FK = PurchaseOrderNumber_FK; }
	
	public String getInvoiceSupplierName() {return InvoiceSupplierName; }
	public void setInvoiceSupplierName(String InvoiceSupplierName) { this.InvoiceSupplierName = InvoiceSupplierName; }
	
	public String getInvoiceStatus() { return InvoiceStatus; }
	public void setInvoiceStatus(String InvoiceStatus) { this.InvoiceStatus = InvoiceStatus; }
}
