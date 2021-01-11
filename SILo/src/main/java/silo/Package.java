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
public class Package {
    private int PackageNumber; //PRIMARY KEY
    private int InvoiceNumber_FK; //FOREIGN KEY from Invoice table
	
    public int getPackageNumber() { return PackageNumber; }
    public void setPackageNumber(int PackageNumber) { this.PackageNumber = PackageNumber; }
	
    public int getInvoiceNumber_FK() { return InvoiceNumber_FK; }
    public void InvoiceNumber_FK(int InvoiceNumber_FK) { this.InvoiceNumber_FK = InvoiceNumber_FK; }
    
}
