/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainrestaurant.view;

import mainrestaurant.view.Revenue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import edu.sit.cs.db.CSDbDelegate;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import mainrestaurant.control.ReservationController;

/**
 *
 * @author ngunngun
 */
public class Reservation extends javax.swing.JFrame {

    JFrame test;
    DefaultTableModel model;
    
    private ReservationController controller = new ReservationController();

    /**
     * Creates new form Reservation
     */
    public Reservation() {
        initComponents();
        setTableSize();
        model = (DefaultTableModel) tblReserve.getModel();
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
        tblReserve = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfDate = new javax.swing.JTextField();
        tfTime = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        btnBill = new javax.swing.JButton();
        btnRevenue = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        tfTable = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        jLabel1.setText("RESERVATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        tblReserve.setFont(new java.awt.Font("Thonburi", 0, 12)); // NOI18N
        tblReserve.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Name", "Date", "Time", "custumerNo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblReserve);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 110, -1, 286));

        jLabel2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel2.setText("Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 408, -1, -1));

        jLabel3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel3.setText("Time :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 490, -1, -1));

        jLabel4.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel4.setText("Date :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, -1, -1));

        tfName.setFont(new java.awt.Font("Thonburi", 0, 18)); // NOI18N
        getContentPane().add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 402, 130, -1));

        tfDate.setFont(new java.awt.Font("Thonburi", 0, 18)); // NOI18N
        getContentPane().add(tfDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 444, 130, -1));
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        Date date = new Date(); // get current date
        tfDate.setText(dateFormat.format(date) + "");

        tfTime.setFont(new java.awt.Font("Thonburi", 0, 18)); // NOI18N
        tfTime.setText("00:00:00");
        getContentPane().add(tfTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 484, 100, -1));

        jLabel5.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel5.setText("PeopleNum :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 555, -1, -1));

        btnSubmit.setFont(new java.awt.Font("Thonburi", 0, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitMouseClicked(evt);
            }
        });
        getContentPane().add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, -1, -1));

        btnOrder.setFont(new java.awt.Font("Impact", 0, 40)); // NOI18N
        btnOrder.setForeground(java.awt.Color.red);
        btnOrder.setText("ORDER");
        btnOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrderMouseClicked(evt);
            }
        });
        getContentPane().add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, -1, -1));

        btnBill.setFont(new java.awt.Font("Impact", 0, 40)); // NOI18N
        btnBill.setForeground(java.awt.Color.red);
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
        getContentPane().add(btnBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, -1, -1));

        btnRevenue.setFont(new java.awt.Font("Impact", 0, 40)); // NOI18N
        btnRevenue.setForeground(java.awt.Color.red);
        btnRevenue.setText("REVENUE");
        btnRevenue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRevenueMouseClicked(evt);
            }
        });
        getContentPane().add(btnRevenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, -1));

        btnReset.setFont(new java.awt.Font("Thonburi", 0, 18)); // NOI18N
        btnReset.setText("RESET!!!");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        btnShow.setFont(new java.awt.Font("Thonburi", 0, 18)); // NOI18N
        btnShow.setText("Show all");
        btnShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShowMouseClicked(evt);
            }
        });
        getContentPane().add(btnShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 404, -1, -1));

        tfTable.setFont(new java.awt.Font("Thonburi", 0, 18)); // NOI18N
        tfTable.setText("2");
        tfTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTableActionPerformed(evt);
            }
        });
        getContentPane().add(tfTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 549, 40, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainrestaurant/view/icon-reservation-black2.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 110, 100));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainrestaurant/view/waiter.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 300, 290));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainrestaurant/view/BackgroundCookingFoodReservation.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 800, 670));

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
    
    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked
        controller.showReserver(model);
        controller.addReserverDB(tfName, tfDate, tfTime, tfTable);
        controller.addReserverColumn(model, tfName, tfDate, tfTime, tfTable);
    }//GEN-LAST:event_btnSubmitMouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        if (model.getRowCount() > 0) {
            btnReset.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    controller.RemoveReserve();
                }      
            });

            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
        }
    }//GEN-LAST:event_btnResetMouseClicked

    private void btnShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowMouseClicked
        controller.showReserver(model);
    }//GEN-LAST:event_btnShowMouseClicked

    private void tfTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTableActionPerformed

    private void btnBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBillActionPerformed

    private void setTableSize() {
        tblReserve.getColumnModel().getColumn(0).setPreferredWidth(3);
        tblReserve.getColumnModel().getColumn(1).setPreferredWidth(120);
        tblReserve.getColumnModel().getColumn(2).setPreferredWidth(70);
        tblReserve.getColumnModel().getColumn(3).setPreferredWidth(50);
        tblReserve.getColumnModel().getColumn(4).setPreferredWidth(70);
        tblReserve.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 14));

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        tblReserve.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tblReserve.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tblReserve.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tblReserve.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        tblReserve.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
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
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and dibtnOrdere form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBill;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnRevenue;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReserve;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfTable;
    private javax.swing.JTextField tfTime;
    // End of variables declaration//GEN-END:variables
}
