/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window_cleaner;

import java.io.IOException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.JXDatePicker;

/**
 *
 * @author tmitche1
 */
public class AddRecordWindow extends javax.swing.JFrame {

    
    WindowController controller = null;
    /**
     * Creates new form edit_menu
     */
    public AddRecordWindow(WindowController controller) {
        this.controller = controller;
        initComponents();
        DefaultComboBoxModel items = new DefaultComboBoxModel(controller.getHousesForCurentStreet());
        addHouseComboBox.setModel(items);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addHouseLabel = new javax.swing.JLabel();
        addPriceTextField = new javax.swing.JTextField();
        addPriceLabel = new javax.swing.JLabel();
        addStatusLabel = new javax.swing.JLabel();
        addStateComboBox = new javax.swing.JComboBox<>();
        addRecordSubmitButton = new javax.swing.JButton();
        addHouseComboBox = new javax.swing.JComboBox<>();
        datePicker = new org.jdesktop.swingx.JXDatePicker();
        addStatusLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        addHouseLabel.setText("House:");

        addPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPriceTextFieldActionPerformed(evt);
            }
        });

        addPriceLabel.setText("Price:");

        addStatusLabel.setText("State:");

        addStateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PAID", "NOT PAID", "NEXT TIME" }));
        addStateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStateComboBoxActionPerformed(evt);
            }
        });

        addRecordSubmitButton.setText("Add Record");
        addRecordSubmitButton.setToolTipText("");
        addRecordSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecordSubmitButtonActionPerformed(evt);
            }
        });

        addHouseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        addHouseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHouseComboBoxActionPerformed(evt);
            }
        });

        addStatusLabel1.setText("Date:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addHouseLabel)
                            .addComponent(addPriceLabel)
                            .addComponent(addStatusLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addPriceTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addHouseComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 169, Short.MAX_VALUE)
                            .addComponent(addStateComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addRecordSubmitButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addStatusLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addHouseLabel)
                    .addComponent(addHouseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addStateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addStatusLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(addRecordSubmitButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addPriceTextFieldActionPerformed

    private void addStateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStateComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addStateComboBoxActionPerformed

    private void addHouseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHouseComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addHouseComboBoxActionPerformed

    private void addRecordSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecordSubmitButtonActionPerformed
        try {
            String house = addHouseComboBox.getSelectedItem().toString();
            Double price = Double.valueOf(addPriceTextField.getText());
            String label = addStateComboBox.getSelectedItem().toString();
            long timeInMillis = datePicker.getDate().getTime();
            controller.addRecord(house, price, label, timeInMillis);
            this.dispose();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong! Pls restart the program", "Ops", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Price missing", "Ops", JOptionPane.INFORMATION_MESSAGE);
        } catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Date missing", "Ops", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_addRecordSubmitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> addHouseComboBox;
    private javax.swing.JLabel addHouseLabel;
    private javax.swing.JLabel addPriceLabel;
    private javax.swing.JTextField addPriceTextField;
    private javax.swing.JButton addRecordSubmitButton;
    private javax.swing.JComboBox<String> addStateComboBox;
    private javax.swing.JLabel addStatusLabel;
    private javax.swing.JLabel addStatusLabel1;
    private org.jdesktop.swingx.JXDatePicker datePicker;
    // End of variables declaration//GEN-END:variables
}
