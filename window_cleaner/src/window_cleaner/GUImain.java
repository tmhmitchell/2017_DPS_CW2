/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window_cleaner;

import entities.CleaningRecord;
import entities.House;
import entities.Street;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import javax.swing.DefaultCellEditor;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author badan
 */
public class GUImain extends javax.swing.JFrame {
    
    WindowController controller = null;
    private static final String[] labels = {"PAID", "NOT PAID", "NEXT TIME"};
    
    /**
     * Creates new form GUImain
     */
    GUImain(WindowController controller) {
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

        statusComboBox = new javax.swing.JComboBox<>();
        streetLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        balanceLabel = new javax.swing.JLabel();
        balanceValueLabel = new javax.swing.JLabel();
        optionalErrorMessage = new javax.swing.JLabel();
        streetNameTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();

        statusComboBox.setEditable(false);
        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PAID", "NOT PAID", "NEXT TIME" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        streetLabel.setText("Street:");

        table.setBackground(new java.awt.Color(237, 237, 237));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "House", "Price", "Date", "Staus"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(237, 237, 237));
        jScrollPane3.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(statusComboBox));
        }

        balanceLabel.setText("Balance:");

        balanceValueLabel.setText("0");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(streetLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(streetNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(balanceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(balanceValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(optionalErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetLabel)
                    .addComponent(balanceLabel)
                    .addComponent(balanceValueLabel)
                    .addComponent(streetNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionalErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        searchButton.getAccessibleContext().setAccessibleName("SearchButton");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
//        String searchText = streetNameTextField.getText();
//        if(streets.containsKey(searchText)){
//             redrawTable((Street)streets.get(searchText));
//             optionalErrorMessage.setText("");
//        }else{
//            optionalErrorMessage.setText(searchText + " street not found");
//        }
    }//GEN-LAST:event_searchButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JLabel balanceValueLabel;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel optionalErrorMessage;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JLabel streetLabel;
    private javax.swing.JTextField streetNameTextField;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void redrawTable(Street street) {
        DefaultTableModel tModel = (DefaultTableModel) table.getModel();
        tModel.setRowCount(0);
        Iterator housesIterator = street.getHouses().values().iterator();
        while(housesIterator.hasNext()){
            House h = (House) housesIterator.next();
            Iterator recordsIterator = h.getCleaningRecords().iterator();
            while(recordsIterator.hasNext()){
                CleaningRecord record = (CleaningRecord) recordsIterator.next();
                Object houseNumber = h.getNumber();
                Object price = record.getPrice();
                Object date = formatDate(record.getDate());
                Object label = formatLabel(record.getLabel());
                tModel.addRow(new Object[]{ houseNumber, price, date, label});
            }
        }
    }

    private String formatPrice(double price) {
        // TODO: I do not why I can not convert double to string
        return Double.toString(price);
    }

    private String formatDate(long date) {
        SimpleDateFormat formater = new SimpleDateFormat("d MMM yyyy");
        return formater.format(new Date(date));
    }

    private String formatLabel(int label) {
        return labels[label];
    }
}
