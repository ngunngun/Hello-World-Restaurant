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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author lalluby
 */
public class Reservation extends javax.swing.JFrame {

    JFrame test;
    javax.swing.table.DefaultTableModel model;

    /**
     * Creates new form Reservation
     */
    public Reservation() {
        initComponents();
        setTableSize();
        model = (javax.swing.table.DefaultTableModel) tblReserve.getModel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        jLabel1.setText("RESERVATION");

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

        jLabel2.setText("Name :");

        jLabel3.setText("Time :");

        jLabel4.setText("Date and Time:");

        tfDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDateActionPerformed(evt);
            }
        });

        tfTime.setText("00:00:00");
        tfTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTimeActionPerformed(evt);
            }
        });

        jLabel5.setText("PeopleNum :");

        btnSubmit.setText("Submit");
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitMouseClicked(evt);
            }
        });

        btnOrder.setFont(new java.awt.Font("Lucida Grande", 0, 40)); // NOI18N
        btnOrder.setText("ORDER");
        btnOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrderMouseClicked(evt);
            }
        });
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        btnBill.setFont(new java.awt.Font("Lucida Grande", 0, 40)); // NOI18N
        btnBill.setText("BILLING");
        btnBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBillMouseClicked(evt);
            }
        });

        btnRevenue.setFont(new java.awt.Font("Lucida Grande", 0, 40)); // NOI18N
        btnRevenue.setText("REVENUE");
        btnRevenue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRevenueMouseClicked(evt);
            }
        });

        btnReset.setText("RESET!!!");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnShow.setText("Show all");
        btnShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShowMouseClicked(evt);
            }
        });
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        tfTable.setText("2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDate, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTime, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(120, 120, 120)
                                .addComponent(btnShow))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSubmit)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBill)
                            .addComponent(btnOrder)
                            .addComponent(btnRevenue))
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnReset)
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOrder)
                        .addGap(41, 41, 41)
                        .addComponent(btnBill)
                        .addGap(49, 49, 49)
                        .addComponent(btnRevenue)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addGap(26, 26, 26))
        );

        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        Date date = new Date(); // get current date
        tfDate.setText(dateFormat.format(date) + "");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDateActionPerformed

    }//GEN-LAST:event_tfDateActionPerformed

    private void tfTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTimeActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderMouseClicked
        btnOrder.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Main od = new Main();
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
    int line = 1;
    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked
        CSDbDelegate db = new CSDbDelegate("cs14sitkmutt.me", "3306", "CSC105_G2", "CSC105_G2", "CSC105_G2");
        System.out.println(db.connect());
        String Customer = "INSERT INTO RESTAURANT_Reservation(NAME, DATE, TIME,PEOPLE)"
                + "VALUE(" + "'" + tfName.getText() + "'" + "," + "'" + tfDate.getText()
                + "'" + "," + "'" + tfTime.getText() + "'" + "," + "'" + tfTable.getText()
                + "'" + ")";
        db.executeQuery(Customer);
        db.disconnect();

        model.addRow(new Object[0]);
        model.setValueAt(line, line - 1, 0);
        model.setValueAt(tfName.getText(), line - 1, 1);
        model.setValueAt(tfDate.getText(), line - 1, 2);
        model.setValueAt(tfTime.getText(), line - 1, 3);
        model.setValueAt(Integer.parseInt(tfTable.getText()), line - 1, 4);
        line++;
    }//GEN-LAST:event_btnSubmitMouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        if (model.getRowCount() > 0) {
            btnReset.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    CSDbDelegate db = new CSDbDelegate("cs14sitkmutt.me", "3306", "CSC105_G2", "CSC105_G2", "CSC105_G2");
                    System.out.println(db.connect());
                    String Clear = "DELETE FROM `RESTAURANT_Reservation` WHERE 1";
                    db.executeQuery(Clear);
                    String ai = "ALTER TABLE RESTAURANT_Reservation AUTO_INCREMENT = 1";
                    db.executeQuery(ai);
                    db.disconnect();
                }
            });

            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
        }
    }//GEN-LAST:event_btnResetMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowMouseClicked
        if(model.getRowCount()==0){
        
        CSDbDelegate db = new CSDbDelegate("cs14sitkmutt.me", "3306", "CSC105_G2", "CSC105_G2", "CSC105_G2");
        System.out.println(db.connect());

        String re = "SELECT * FROM RESTAURANT_Reservation";
        ArrayList<HashMap> all = db.queryRows(re);

        for (HashMap t : all) {
            String name = (String) t.get("NAME");
            String date = (String) t.get("DATE");
            String time = (String) t.get("TIME");
            int human = Integer.parseInt((String) t.get("PEOPLE"));
            model.addRow(new Object[0]);
            model.setValueAt(line, line - 1, 0);
            model.setValueAt(name, line - 1, 1);
            model.setValueAt(date, line - 1, 2);
            model.setValueAt(time, line - 1, 3);
            model.setValueAt(human, line - 1, 4);
            line++;
        }
        db.disconnect();
        }
    }//GEN-LAST:event_btnShowMouseClicked

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReserve;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfTable;
    private javax.swing.JTextField tfTime;
    // End of variables declaration//GEN-END:variables
}