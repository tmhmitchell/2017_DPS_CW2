/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window_cleaner;

import exceptions.StreetAlreadyExistsException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author badan
 */
public class AddStreetWindow extends javax.swing.JFrame {

    
    WindowController controller = null;
    /**
     * Creates new form addStreetWindow
     */
    public AddStreetWindow(WindowController controller) {
        this.controller = controller;
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

        addStreetLabel = new javax.swing.JLabel();
        addStreetTextField = new javax.swing.JTextField();
        addStreetSubmitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        addStreetLabel.setText("Street:");

        addStreetTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStreetTextFieldActionPerformed(evt);
            }
        });

        addStreetSubmitButton.setText("Add Street");
        addStreetSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStreetSubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addStreetLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(addStreetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addStreetSubmitButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addStreetLabel)
                    .addComponent(addStreetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addStreetSubmitButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStreetTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStreetTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addStreetTextFieldActionPerformed

    private void addStreetSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStreetSubmitButtonActionPerformed
        try {
            controller.addStreet(addStreetTextField.getText());
        } catch (IOException ex) {
        } catch (StreetAlreadyExistsException ex) {
            addStreetTextField.setText("This street already exists");
        }
        this.dispose();
    }//GEN-LAST:event_addStreetSubmitButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addStreetLabel;
    private javax.swing.JButton addStreetSubmitButton;
    private javax.swing.JTextField addStreetTextField;
    // End of variables declaration//GEN-END:variables
}
