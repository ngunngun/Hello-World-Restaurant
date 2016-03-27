/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainrestaurant.model;

import edu.sit.cs.db.CSDbDelegate;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import mainrestaurant.control.OrderController;

/**
 *
 * @author ngunngun
 */
public class DBMethod extends CSDbDelegate{
    private CSDbDelegate dbb;
    private OrderController or;
    
    public DBMethod() {
        dbb = new CSDbDelegate("csprog-in.sit.kmutt.ac.th", "3306", "CSC105_G2", "csc105_2014", "csc105");
    }
    
    public void dbConnect() {
        System.out.println(dbb.connect());
    }
    
    public void dbDisConnect() {
        dbb.disconnect();
    }
    
    public void dbExecuteQuery(String sql){
        dbb.executeQuery(sql);
    }

    
    //REVENUE
    
    public ArrayList<HashMap> getAllBill() {
        dbConnect();
        String bill = "SELECT * FROM RESTAURANT_Income";
        ArrayList<HashMap> total = dbb.queryRows(bill);
        dbDisConnect();
        return total;
    }
        
    public void clearRevenue() {
        dbConnect();
        String Clear = "DELETE FROM `RESTAURANT_Income` WHERE 1";
        dbExecuteQuery(Clear);
        String ai = "ALTER TABLE RESTAURANT_Income AUTO_INCREMENT = 1";
        dbExecuteQuery(ai);
        dbDisConnect();
    }
    
    
    //RESERVATION
    public ArrayList<HashMap> getAllReserver() {
        dbConnect();
        String re = "SELECT * FROM RESTAURANT_Reservation";
        ArrayList<HashMap> all = dbb.queryRows(re);
        dbDisConnect();
        return all;
    }
    
    public void addReserverDB(JTextField tfName, JTextField tfDate, JTextField tfTime, JTextField tfTable) {
        dbConnect();
        String Customer = "INSERT INTO RESTAURANT_Reservation(NAME, DATE, TIME,PEOPLE)"
                + "VALUE(" + "'" + tfName.getText() + "'" + "," + "'" + tfDate.getText()
                + "'" + "," + "'" + tfTime.getText() + "'" + "," + "'" + tfTable.getText()
                + "'" + ")";
        dbExecuteQuery(Customer);
        dbDisConnect();
    }
    
    public void RemoveReserve() {
        dbConnect();
        String Clear = "DELETE FROM `RESTAURANT_Reservation` WHERE 1";
        dbExecuteQuery(Clear);
        String ai = "ALTER TABLE RESTAURANT_Reservation AUTO_INCREMENT = 1";
        dbExecuteQuery(ai);
        dbDisConnect();
    }
    
    //ORDER
    public String showPopularMenu() throws HeadlessException {
        dbConnect();
        String num = "";
        String pop = "SELECT `ORDER`,SUM(`AMOUNT`) FROM `RESTAURANT_mostPopular` WHERE 1 GROUP BY `ORDER` ORDER BY SUM(`AMOUNT`) ASC";
        num = getPopularMenu(dbb, pop, num);
        dbDisConnect();
        return num;
    }
    
    public String getPopularMenu(CSDbDelegate db, String pop, String num) {
        ArrayList<HashMap> mostP = db.queryRows(pop);
        for (HashMap m : mostP) {
            num = (String) m.get("ORDER");
        }
        return num;
    }
    
    
}
