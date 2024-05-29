/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class bai1 {

    public static void main(String[] args) {
        try {
            String user = "sa";
            String pass = "123";
            String url = "jdbc:sqlserver://;serverName=TUNPC;databaseName=Aglie";
            Connection con = DriverManager.getConnection(url, user, pass);
            String sql = "select * from Students";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.print(rs.getString("MaSV") + ", ");
                System.out.print(rs.getString("HoTen") + ", ");
                System.out.print(rs.getString("Email") + ", ");
                System.out.print(rs.getString("SDT") + ", ");
                System.out.print(rs.getString("GioiTinh") + ", ");

            }
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
