/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainrestaurant;

import edu.sit.cs.db.CSDbDelegate;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author ngunngun
 */
public class Main extends javax.swing.JFrame {

    JFrame test;
    javax.swing.table.DefaultTableModel model;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setTableSize();
        model = (javax.swing.table.DefaultTableModel) tblOrder.getModel();
    }

    public void setJFrame(JFrame f) {
        test = f;
    }

    public JFrame getJFrame() {
        return this.test;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        btnBill = new javax.swing.JButton();
        btnReserve = new javax.swing.JButton();
        btnRevenue = new javax.swing.JButton();
        cbbMenu = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        spnAmount = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbbTable = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        btnPop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        jLabel1.setText("ORDER");

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Order", "Amount", "TableNum"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrder);

        btnBill.setFont(new java.awt.Font("Lucida Grande", 0, 40)); // NOI18N
        btnBill.setText("BILLING");
        btnBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBillMouseClicked(evt);
            }
        });
        btnBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillActionPerformed(evt);
            }
        });

        btnReserve.setFont(new java.awt.Font("Lucida Grande", 0, 40)); // NOI18N
        btnReserve.setText("RESERVATION");
        btnReserve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReserveMouseClicked(evt);
            }
        });
        btnReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserveActionPerformed(evt);
            }
        });

        btnRevenue.setFont(new java.awt.Font("Lucida Grande", 0, 40)); // NOI18N
        btnRevenue.setText("REVENUE");
        btnRevenue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRevenueMouseClicked(evt);
            }
        });

        cbbMenu.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        cbbMenu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fried_rice(with egg,pork,chicken)", "Fried_rice(with squid,shrimp)", "Macaroni_Soup(creamy/tomato/chicken soup)", "Pizza(L)", "Pizza(M)", "Rice_with_fried_pork_with_pepper_and_garlic", "Spaghetti_Bolognese", "Spaghetti_Carbonara", "Tom_Yum" }));
        cbbMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMenuActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Al Bayan", 0, 18)); // NOI18N
        jLabel2.setText("Menu :");

        spnAmount.setFont(new java.awt.Font("Al Bayan", 0, 18)); // NOI18N
        spnAmount.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        jLabel3.setFont(new java.awt.Font("Al Bayan", 0, 18)); // NOI18N
        jLabel3.setText("Amount :");

        btnSubmit.setFont(new java.awt.Font("Al Bayan", 0, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitMouseClicked(evt);
            }
        });
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("TableNum :");

        cbbTable.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        cbbTable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbbTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTableActionPerformed(evt);
            }
        });

        jButton1.setText("Undo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnPop.setText("The most popular memu~!!!");
        btnPop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPopMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnRevenue)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(btnBill))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSubmit)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spnAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbbTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReserve)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(btnPop)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(btnBill))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(cbbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(spnAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(cbbTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addComponent(btnSubmit))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnReserve)
                                .addGap(31, 31, 31)
                                .addComponent(btnRevenue))))
                    .addComponent(btnPop))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReserveActionPerformed

    private void cbbMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbMenuActionPerformed

    private void btnBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBillActionPerformed

    private void btnBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBillMouseClicked
        btnBill.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Billing b1 = new Billing();
                b1.setJFrame(b1);
                b1.getJFrame().setVisible(true);
                getJFrame().setVisible(false);
            }
        });
    }//GEN-LAST:event_btnBillMouseClicked

    private void btnReserveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReserveMouseClicked
        btnReserve.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Reservation rs = new Reservation();
                rs.setJFrame(rs);
                rs.getJFrame().setVisible(true);
                getJFrame().setVisible(false);

            }
        });
    }//GEN-LAST:event_btnReserveMouseClicked

    private void btnRevenueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRevenueMouseClicked
        btnRevenue.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Revenue rn = new Revenue();
                rn.setJFrame(rn);
                rn.getJFrame().setVisible(true);
                getJFrame().setVisible(false);
            }
        });
    }//GEN-LAST:event_btnRevenueMouseClicked

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitActionPerformed
    int line = 1; // this line is for run row
    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked
        // mouse click submit then
        //CSDbDelegate db = new CSDbDelegate("cs14sitkmutt.me", "3306", "CSC105_G2", "CSC105_G2", "CSC105_G2");
        CSDbDelegate db = new CSDbDelegate("csprog-in.sit.kmutt.ac.th", "3306", "CSC105_G2", "csc105_2014", "csc105");
        System.out.println(db.connect());

        int i = model.getRowCount() - 1;

        String check = "SELECT isUsing FROM RESTAURANT_Tables WHERE TABLENUM = " + cbbTable.getSelectedItem().toString();
        ArrayList<HashMap> total = db.queryRows(check);
        int u = 0;
        for (HashMap t : total) {
            u = Integer.parseInt((String) t.get("isUsing"));
        }
        if (u == 1 && i == -1) {
            JOptionPane.showMessageDialog(null, "This table is using");
        } else {

            // this model is to make a row to get a value from submit
            model.addRow(new Object[0]);
            //(thing we want to get,row,column(1 is place for get order))
            model.setValueAt(line, line - 1, 0); // line+1 because line is start from 0
            model.setValueAt(cbbMenu.getSelectedItem().toString(), line - 1, 1);
            model.setValueAt(spnAmount.getValue(), line - 1, 2);
            model.setValueAt(cbbTable.getSelectedItem().toString(), line - 1, 3);

            String use = "UPDATE `RESTAURANT_Tables` SET `isUsing`= 1 WHERE TABLENUM = " + cbbTable.getSelectedItem().toString();
            db.executeQuery(use);
            String menu = cbbMenu.getSelectedItem().toString();
            int amount = Integer.parseInt(spnAmount.getValue().toString());
            int tableNo = Integer.parseInt(cbbTable.getSelectedItem().toString());
            String keep = "INSERT INTO `RESTAURANT_Keeper`(`NO`, `ORDER`, `AMOUNT`, `TABLENUM`) VALUES "
                    + " ( " + line + " ,' " + menu + " ', " + amount + " , " + tableNo + ");";
            db.executeQuery(keep);
            String pop = "INSERT INTO `RESTAURANT_mostPopular`(`ORDER`, `AMOUNT`) VALUES "
                    + "('" + menu + " ',' " + amount + "');";
            db.executeQuery(pop);
            db.disconnect();
            line++; //for add new row for data
        }
    }//GEN-LAST:event_btnSubmitMouseClicked

    private void cbbTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbTableActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (line - 1 > 0) {
            model.removeRow(line - 2);
            line--;
            //CSDbDelegate db = new CSDbDelegate("cs14sitkmutt.me", "3306", "CSC105_G2", "CSC105_G2", "CSC105_G2");
            CSDbDelegate db = new CSDbDelegate("csprog-in.sit.kmutt.ac.th", "3306", "CSC105_G2", "csc105_2014", "csc105");
            System.out.println(db.connect());
            String menu = cbbMenu.getSelectedItem().toString();
            int amount = Integer.parseInt(spnAmount.getValue().toString());
            int tableNo = Integer.parseInt(cbbTable.getSelectedItem().toString());
            String keep = "DELETE FROM `RESTAURANT_Keeper` WHERE NO = " + (line);
            String use = "UPDATE `RESTAURANT_Tables` SET `isUsing`= 0 WHERE TABLENUM = " + cbbTable.getSelectedItem().toString();
            db.executeQuery(keep);
            db.executeQuery(use);
            db.disconnect();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPopMouseClicked
        CSDbDelegate db = new CSDbDelegate("csprog-in.sit.kmutt.ac.th", "3306", "CSC105_G2", "csc105_2014", "csc105");
        //CSDbDelegate db = new CSDbDelegate("cs14sitkmutt.me", "3306", "CSC105_G2", "CSC105_G2", "CSC105_G2");
        System.out.println(db.connect());
        String num = "";
        String pop = "SELECT `ORDER`,SUM(`AMOUNT`) FROM `RESTAURANT_mostPopular` WHERE 1 GROUP BY `ORDER` ORDER BY SUM(`AMOUNT`) ASC";
        ArrayList<HashMap> mostP = db.queryRows(pop);
            for (HashMap m : mostP) {
                num = (String) m.get("ORDER");
            }
        db.disconnect();
        JOptionPane.showMessageDialog(null, num);

    }//GEN-LAST:event_btnPopMouseClicked

    private void setTableSize() {
        tblOrder.getColumnModel().getColumn(0).setPreferredWidth(5);
        tblOrder.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblOrder.getColumnModel().getColumn(2).setPreferredWidth(35);
        tblOrder.getColumnModel().getColumn(3).setPreferredWidth(45);
        tblOrder.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 14));

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        tblOrder.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tblOrder.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tblOrder.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tblOrder.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBill;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnReserve;
    private javax.swing.JButton btnRevenue;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cbbMenu;
    private javax.swing.JComboBox cbbTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnAmount;
    private javax.swing.JTable tblOrder;
    // End of variables declaration//GEN-END:variables
}
