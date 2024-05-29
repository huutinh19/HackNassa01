/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyenTap;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class sv {

    ArrayList<LT> getList() {
        ArrayList<LT> list = new ArrayList<>();
        try {
            Connection con = dbc.getConnection();
            String sql = "select Ma,Ten,GiaBan,TrangThai from XeMay";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LT l = new LT();
                l.setMa(rs.getString(1));
                l.setTen(rs.getString(2));
                l.setGia(rs.getFloat(3));
                l.setTh(rs.getBoolean(4));
                list.add(l);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    void sua(LT l) {
        try {
            Connection con = dbc.getConnection();
            String sql = "update XeMay set Ten=?,GiaBan=?,TrangThai=? where ma=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, l.getTen());
            ps.setFloat(2, l.getGia());
            ps.setString(3, l.getTh() ? "1" : "0");
            ps.setString(4, l.getMa());
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void them(LT l) {
        try {
            Connection con = dbc.getConnection();
            String sql = "insert into XeMay(Ma,ten,giaban,trangthai) values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, l.getMa());
            ps.setString(2, l.getTen());
            ps.setFloat(3, l.getGia());
            ps.setString(4, l.getTh() ? "1" : "0");
            ps.executeUpdate();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void xoa(String ma){
        try {
            Connection con = dbc.getConnection();
            String sql = "delete XeMay where ma=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ma);
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
}
