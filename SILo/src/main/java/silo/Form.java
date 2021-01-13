/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silo;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Waldo
 */
public class Form {
    private static JPanel newDNForm = new JPanel();
    
    public Form() {
        newDNForm.setLayout(null);
        
        JLabel invoiceLabel = new JLabel("Invoice number: ");
        invoiceLabel.setBounds(500, 180, 150, 30);
        newDNForm.add(invoiceLabel);
        
        JComboBox<Invoice> invoiceCB = new JComboBox<>();
        invoiceCB.setBounds(700, 180, 200, 30);
        newDNForm.add(invoiceCB);
        
        JLabel DNLabel = new JLabel("Delivery note number: ");
        DNLabel.setBounds(500, 240, 150, 30);
        newDNForm.add(DNLabel);
        
        JComboBox<DeliveryNote> DNCB = new JComboBox<>();
        DNCB.setBounds(700, 240, 200, 30);
        newDNForm.add(DNCB);
        
        JLabel ODLabel = new JLabel("Order date: ");
        ODLabel.setBounds(500, 300, 150, 30);
        newDNForm.add(ODLabel);
        
        JTextField orderDate = new JTextField();
        orderDate.setEditable(false);
        orderDate.setBounds(700, 300, 200, 30);
        newDNForm.add(orderDate);
        
        JLabel DDLabel = new JLabel("Delivery date: ");
        DDLabel.setBounds(500, 360, 150, 30);
        newDNForm.add(DDLabel);
        
        JTextField deliveryDate = new JTextField();
        deliveryDate.setEditable(false);
        deliveryDate.setBounds(700, 360, 200, 30);
        newDNForm.add(deliveryDate);
        
        JLabel CNLabel = new JLabel("Customer name: ");
        CNLabel.setBounds(500, 420, 150, 30);
        newDNForm.add(CNLabel);
        
        JComboBox<Customer> customerCB = new JComboBox<>();
        customerCB.setBounds(700, 420, 200, 30);
        newDNForm.add(customerCB);
        
        JLabel CELabel = new JLabel("Customer email: ");
        CELabel.setBounds(500, 480, 150, 30);
        newDNForm.add(CELabel);
        
        JTextField customerEmail = new JTextField();
        customerEmail.setEditable(false);
        customerEmail.setBounds(700, 480, 200, 30);
        newDNForm.add(customerEmail);
        
        JLabel statusLabel = new JLabel("Status: ");
        statusLabel.setBounds(500, 540, 150, 30);
        newDNForm.add(statusLabel);
        
        JTextField status = new JTextField("New");
        status.setEditable(false);
        status.setBounds(700, 540, 200, 30);
        newDNForm.add(status);
        
    }
    
    public static JPanel getNewDNForm() {
        return newDNForm;
    }
    
}
