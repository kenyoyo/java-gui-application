/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author KAZDO
 */
public class Gui_db {

    public static Connection getConnection() throws SQLException {
        Connection conn = null;

        //try {
        // load the properties file
        /*Properties pros = new Properties();
            pros.load(new FileInputStream("db.properties"));*/
        // assign db parameters
        String url = "jdbc:mysql://localhost:3306/project_db";
        String user = "root";
        String password = "Supawadee2103";

        /*String url = pros.getProperty("url");
            String user = pros.getProperty("user");
            String password = pros.getProperty("password");*/
        // create a connection to the database
        conn = DriverManager.getConnection(url, user, password);
        /*} catch (IOException e) {
            System.out.println(e.getMessage());
        }*/
        return conn;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             try (Connection conn = Gui_db.getConnection()) {
            
            // print out a message
            System.out.println(String.format("Connected to database %s "
                    + "successfully.", conn.getCatalog()));
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
