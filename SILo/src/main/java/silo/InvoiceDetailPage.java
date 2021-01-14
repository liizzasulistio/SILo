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
public class InvoiceDetailPage extends javax.swing.JPanel {

    /**
     * Creates new form InvoiceDetailPage
     */
    private InvoiceCtl invoiceCtl;
    public InvoiceDetailPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        invoiceNumberLabel = new javax.swing.JLabel();
        invoiceNumberLbl = new javax.swing.JLabel();
        poNumberLabel = new javax.swing.JLabel();
        supplierNameLabel = new javax.swing.JLabel();
        invoiceOrderDateLabel = new javax.swing.JLabel();
        invoiceDeliveryDateLabel = new javax.swing.JLabel();
        invoiceStatus = new javax.swing.JLabel();
        invoiceStatusLbl = new javax.swing.JLabel();
        invoiceDeliveryDateLbl = new javax.swing.JLabel();
        invoiceOrderDateLbl = new javax.swing.JLabel();
        supplierNameLbl = new javax.swing.JLabel();
        poNumberLbl = new javax.swing.JLabel();
        pendingButton = new javax.swing.JButton();
        acceptButton = new javax.swing.JButton();

        invoiceNumberLabel.setText("Invoice Number");

        invoiceNumberLbl.setText("jLabel7");

        poNumberLabel.setText("PO Number");

        supplierNameLabel.setText("Supplier Name");

        invoiceOrderDateLabel.setText("Order Date");

        invoiceDeliveryDateLabel.setText("Delivery Date");

        invoiceStatus.setText("Status");

        invoiceStatusLbl.setText("jLabel7");

        invoiceDeliveryDateLbl.setText("jLabel7");

        invoiceOrderDateLbl.setText("jLabel7");

        supplierNameLbl.setText("jLabel7");

        poNumberLbl.setText("jLabel7");

        pendingButton.setText("Pending");
        pendingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pendingButtonMouseClicked(evt);
            }
        });

        acceptButton.setText("Accept");
        acceptButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acceptButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invoiceNumberLabel)
                            .addComponent(invoiceStatus)
                            .addComponent(invoiceDeliveryDateLabel)
                            .addComponent(invoiceOrderDateLabel)
                            .addComponent(supplierNameLabel)
                            .addComponent(poNumberLabel))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(invoiceDeliveryDateLbl)
                                    .addComponent(invoiceStatusLbl))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(invoiceNumberLbl)
                                    .addComponent(poNumberLbl)
                                    .addComponent(supplierNameLbl)
                                    .addComponent(invoiceOrderDateLbl))
                                .addContainerGap(184, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pendingButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(acceptButton)
                        .addGap(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceNumberLabel)
                    .addComponent(invoiceNumberLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(poNumberLabel)
                    .addComponent(poNumberLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplierNameLabel)
                    .addComponent(supplierNameLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceOrderDateLabel)
                    .addComponent(invoiceOrderDateLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceDeliveryDateLabel)
                    .addComponent(invoiceDeliveryDateLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceStatus)
                    .addComponent(invoiceStatusLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pendingButton)
                    .addComponent(acceptButton))
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pendingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pendingButtonMouseClicked

    private void acceptButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_acceptButtonMouseClicked
   public void setCurrentInvoice(Invoice invoice){
        invoiceNumberLbl.setText(String.valueOf(invoice.getInvoiceNumber()));
        poNumberLbl.setText(String.valueOf(invoice.getPONumber()));
        supplierNameLbl.setText(invoice.getSupplierName());
        invoiceOrderDateLbl.setText(invoice.getOrderDateString());
        invoiceDeliveryDateLbl.setText(invoice.getDeliveryDateString());
        invoiceStatusLbl.setText(invoice.getStatus());
    }
    
    public void setController(InvoiceCtl invoiceCtl){
        this.invoiceCtl = invoiceCtl;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptButton;
    private javax.swing.JLabel invoiceDeliveryDateLabel;
    private javax.swing.JLabel invoiceDeliveryDateLbl;
    private javax.swing.JLabel invoiceNumberLabel;
    private javax.swing.JLabel invoiceNumberLbl;
    private javax.swing.JLabel invoiceOrderDateLabel;
    private javax.swing.JLabel invoiceOrderDateLbl;
    private javax.swing.JLabel invoiceStatus;
    private javax.swing.JLabel invoiceStatusLbl;
    private javax.swing.JButton pendingButton;
    private javax.swing.JLabel poNumberLabel;
    private javax.swing.JLabel poNumberLbl;
    private javax.swing.JLabel supplierNameLabel;
    private javax.swing.JLabel supplierNameLbl;
    // End of variables declaration//GEN-END:variables
}
