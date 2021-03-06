/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silo;

import java.text.ParseException;
/**
 *
 * @author liizzasulistio
 */
public class DeliveryNoteCtl 
{
    private MainPage mainpage;
    private DBHandler dbHandler;
    private DeliveryNoteForm deliveryNoteForm;
    private DeliveryNoteDetailPage deliveryNoteDetailPage;
    private int editDeliveryNoteIndex=0;
    
    public DeliveryNoteCtl() {}
    
    public DeliveryNoteCtl(DBHandler dbHandler,MainPage mainpage,DeliveryNoteForm deliveryNoteForm, DeliveryNoteDetailPage deliveryNoteDetailPage)
    {
        this.deliveryNoteForm = deliveryNoteForm;
        this.deliveryNoteDetailPage = deliveryNoteDetailPage;
        this.dbHandler = dbHandler;
        this.mainpage = mainpage;
    }
    
    public void requestDeliveryNoteForm()
    {
        deliveryNoteForm.setVisible(true);
    }
    
     public void showDeliveryNoteDescription(DeliveryNote dn)
     {
        deliveryNoteDetailPage.setVisible(true);
        deliveryNoteDetailPage.setCurrentDeliveryNote(dn);
    }
     
    public void addNewDeliveryNoteData(String invoiceNumber,String deliveryNoteNumber,String customerName,String orderDate,
            String deliveryDate,String status) throws ParseException
     {
        dbHandler.insertData(invoiceNumber, deliveryNoteNumber, customerName, orderDate, deliveryDate, status);
        deliveryNoteForm.setVisible(false);
        
        int lastIdx = dbHandler.getListDeliveryNote().size();
        DeliveryNote dn = dbHandler.getListDeliveryNote().get(lastIdx-1);
        
        showDeliveryNoteDescription(dn);
        mainpage.refreshDeliveryNoteList();
    }
     
    public void sendSoftCopyDone()
    {
        deliveryNoteDetailPage.setVisible(false);
    }
     
    public void requestPrint()
    {
        deliveryNoteDetailPage.setVisible(false);
    }
    
    public void requestChangeStatus(String currState, String deliveryNoteNumber)
    {
        dbHandler.changeDeliveryNoteStatus(currState, deliveryNoteNumber);
        deliveryNoteDetailPage.setVisible(false);
        mainpage.refreshDeliveryNoteList();
    }
    
    public void getDeliveryNoteDesciption(DeliveryNote deliveryNote,int index)
    {
        deliveryNoteDetailPage.setVisible(true);
        deliveryNoteDetailPage.setCurrentDeliveryNote(deliveryNote);
        editDeliveryNoteIndex = index;
    }
}
