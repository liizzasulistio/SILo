package silo;

public class Item
{
	private int ItemID; //PRIMARY KEY
	private String ItemBarcode;
	private String ItemTitle;
	private String ItemDescription;
	private String ItemManufacturer;
	private String ItemURL;
	private int ItemStock;
	
	public int getItemID() { return ItemID; }
	public void setItemID(int ItemID) { this.ItemID = ItemID; }
	
	public String getItemBarcode() { return ItemBarcode; }
	public void setItemBarcode(String ItemBarcode) { this.ItemBarcode = ItemBarcode; }
	
	public String getItemTitle() { return ItemTitle; }
	public void setItemTitle(String ItemTitle) { this.ItemTitle = ItemTitle; }
	
	public String getItemDescription() { return ItemDescription; }
	public void setItemDescription(String ItemDescription) { this.ItemDescription = ItemDescription; }
	
	public String getItemManufacturer() { return ItemManufacturer; }
	public void setItemManufacturer(String ItemManufacturer) { this.ItemManufacturer = ItemManufacturer; }
	
	public String getItemURL() { return ItemURL; }
	public void setItemURL(String ItemURL) { this.ItemURL = ItemURL; }
	
	public int getItemStock() { return ItemStock; }
	public void setItemStock(int ItemStock) { this.ItemStock = ItemStock; }
}
