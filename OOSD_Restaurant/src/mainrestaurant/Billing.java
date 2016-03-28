/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainrestaurant;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import edu.sit.cs.db.CSDbDelegate;
import java.awt.Font;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import mainrestaurant.control.BillingController;

/**
 *
 * @author ngunngun
 */
public class Billing extends javax.swing.JFrame {

    JFrame test;
    DefaultTableModel model;
    private BillingController controller = new BillingController();

    /**
     * Creates new form Billing
     */
    public Billing() {
        initComponents();
        setTableSize();
        model = (DefaultTableModel) tblBill.getModel();
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

        cbbTable = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBill = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnOrder = new javax.swing.JButton();
        btnReserve = new javax.swing.JButton();
        btnRevenue = new javax.swing.JButton();
        btnCheck = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cbbTable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbbTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTableActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        jLabel1.setText("BILLING");

        jLabel2.setText("Table :");

        tblBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Menu", "Amount", "Price", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBill);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel3.setText("Total :");

        lbTotal.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lbTotal.setText("...........");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel5.setText("Baht");

        btnOrder.setFont(new java.awt.Font("Lucida Grande", 0, 40)); // NOI18N
        btnOrder.setText("ORDER");
        btnOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrderMouseClicked(evt);
            }
        });

        btnReserve.setFont(new java.awt.Font("Lucida Grande", 0, 40)); // NOI18N
        btnReserve.setText("RESERVATION");
        btnReserve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReserveMouseClicked(evt);
            }
        });

        btnRevenue.setFont(new java.awt.Font("Lucida Grande", 0, 40)); // NOI18N
        btnRevenue.setText("REVENUE");
        btnRevenue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRevenueMouseClicked(evt);
            }
        });

        btnCheck.setText("Check");
        btnCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCheckMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(32, 32, 32)
                                .addComponent(lbTotal)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRevenue)
                    .addComponent(btnReserve)
                    .addComponent(btnOrder)
                    .addComponent(btnCheck))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCheck)
                        .addGap(135, 135, 135)
                        .addComponent(btnOrder)
                        .addGap(49, 49, 49)
                        .addComponent(btnReserve))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRevenue)
                    .addComponent(jLabel3)
                    .addComponent(lbTotal)
                    .addComponent(jLabel5))
                .addGap(0, 50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderMouseClicked
        btnOrder.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Order od = new Order();
                od.setJFrame(od);
                od.getJFrame().setVisible(true);
                getJFrame().setVisible(false);
            }
        });
    }//GEN-LAST:event_btnOrderMouseClicked

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

    /**/
    private void setTableSize() {
        tblBill.getColumnModel().getColumn(0).setPreferredWidth(5);
        tblBill.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblBill.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblBill.getColumnModel().getColumn(3).setPreferredWidth(35);
        tblBill.getColumnModel().getColumn(4).setPreferredWidth(40);
        tblBill.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 14));

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        tblBill.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tblBill.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tblBill.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tblBill.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        tblBill.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
    }
    
    private void cbbTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTableActionPerformed
        controller.checkBill(cbbTable, model, lbTotal);
    }//GEN-LAST:event_cbbTableActionPerformed

    private void btnCheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckMouseClicked
        controller.checkTable(model, lbTotal, cbbTable);
    }//GEN-LAST:event_btnCheckMouseClicked

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnReserve;
    private javax.swing.JButton btnRevenue;
    private javax.swing.JComboBox cbbTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTable tblBill;
    // End of variables declaration//GEN-END:variables
}
