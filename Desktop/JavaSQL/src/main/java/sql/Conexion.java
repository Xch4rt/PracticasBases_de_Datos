/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pablo
 */
public class Conexion {
    public static Connection getConnection()
    {
        // configuracion de la conexion
        String connectionURL = "jdbc:sqlserver://localhost:1433;"
                    + "database=master;"
                    + "user=usuarioSQla;"
                    + "password=master123.;"
                    + "loginTimeout=30;";
        try {
            
            Connection con = DriverManager.getConnection(connectionURL);
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
      
    }
}
