/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class dbc {
     static String url = "jdbc:sqlserver://;serverName= ADMIN;databaseName=Assgnment_JaVa_3;encrypt=true;trustServerCertificate=true;";
    static String user = "sa";
    static String password = "12345";
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url, user, password);
    }
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection(url, user, password);
    }
}
