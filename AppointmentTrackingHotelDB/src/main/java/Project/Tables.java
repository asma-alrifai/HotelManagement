/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author Asmz
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Tables {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            //st.executeUpdate("create table users (name varchar(200), email varchar(200), address varchar(200))");
            //st.executeUpdate("create table room (roomNo varchar (200), roomType varchar (200), bed varchar(200), price int , status varchar(200))");
            //st.executeUpdate("CREATE TABLE customer (id INT, name VARCHAR(200), mobileNumber VARCHAR(10), nationality VARCHAR(200), gender VARCHAR(50), email VARCHAR(200), passport VARCHAR(200), address VARCHAR(500), checkIn VARCHAR(50), roomNo VARCHAR(10), bed VARCHAR(200), roomType VARCHAR(200), pricePerDay INT, totalAmount VARCHAR(200), checkout VARCHAR(50))");
            JOptionPane.showMessageDialog(null, "Table created successfully");
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (st != null) {
                    st.close();
                }
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
        }
    }
}
