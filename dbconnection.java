

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saumil
 */
public class dbconnection {

    Connection conn = null;

    public static Connection ConnectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");
            JOptionPane.showMessageDialog(null, "connected");
            return conn;
        
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
}
