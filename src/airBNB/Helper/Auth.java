/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airBNB.Helper;

import java.sql.*;
/**
 *
 * @author dsouz
 */
public class Auth {
    
    private Connection conn = null;
    
    public Connection getConnection() throws SQLException, ClassNotFoundException{
        if(conn == null) {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        
        return conn;
    }
    
    private static String URL = "**************";
    private static String USERNAME = "*********";
    private static String PASSWORD = "*********";
}
