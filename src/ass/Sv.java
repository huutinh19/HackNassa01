/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ass;

import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * @author ADMIN
 */
public class Sv {

    ArrayList<SinhVien> getListSV() {
        ArrayList<SinhVien> listSV = new ArrayList<>();

        try {
            Connection con = dbc.getConnection();
            String sql = "select * from SinhVien";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setMa(rs.getString(1));
                sv.setTen(rs.getString(2));
                sv.setEmail(rs.getString(3));
                sv.setSdt(rs.getString(4));
                sv.setDia(rs.getString(5));
                sv.setGioi(rs.getInt(6) == 0 ? "Nam" : "Nu");
                
                
                try {
                    String imagePath = rs.getString(7); 
                    BufferedImage image = ImageIO.read(new File(imagePath));
                    sv.setImg(image);

                } catch (Exception e) {
                }

                listSV.add(sv);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSV;
    }

    Boolean xoa(String ma) {
        try {
            Connection con = dbc.getConnection();

            String sql = "delete Diem where masv=? "
                    + "delete SinhVien where masv=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ma);
            ps.setString(2, ma);
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    Boolean them(SinhVien s) {
        try {
            String sql = "insert into SinhVien values(?,?,?,?,?,?,?)";
            Connection con = dbc.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, s.getMa());
            ps.setString(2, s.getTen());
            ps.setString(3, s.getEmail());
            ps.setString(4, s.getSdt());
            ps.setString(5, s.getDia());
            ps.setInt(6, s.getGioi().equals("Nam") ? 0 : 1);
            ps.setString(7, s.getHinh());

            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        getListSV();
        return true;
    }

    Boolean sua(SinhVien s) {
        try {
            String sql = "update SinhVien set  hoten=?, email=?, sodt=? ,diachi=? ,gioitinh=? ,hinh=? where masv=?";
            Connection con = dbc.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, s.getTen());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getSdt());
            ps.setString(4, s.getDia());
            ps.setInt(5, s.getGioi().equals("Nam") ? 0 : 1);
            ps.setString(6, s.getHinh());
            ps.setString(7, s.getMa());
            ps.executeUpdate();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    Boolean themD(DiemSinhVien d) {
        try {
            String sql = "insert into Diem values(?,?,?,?)";
            Connection con = dbc.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, d.getMa());
            ps.setString(2, d.getTiengAnh());
            ps.setString(3, d.getTinHoc());
            ps.setString(4, d.getGDTC());
            ps.executeUpdate();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    ArrayList<DiemSinhVien> getListD() {
        ArrayList<DiemSinhVien> listD = new ArrayList<>();
        try {
            Connection con = dbc.getConnection();
            String sql = "select a.masv,hoten,tienganh,tinhoc,gdtc from Diem a "
                    + "join SinhVien b on a.masv=b.masv "
                    + "group by a.masv,hoten,tienganh,tinhoc,gdtc";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DiemSinhVien d1 = new DiemSinhVien();
                d1.setMa(rs.getString(1));
                d1.setTen(rs.getString(2));
                d1.setTiengAnh(rs.getString(3));
                d1.setTinHoc(rs.getString(4));
                d1.setGDTC(rs.getString(5));
                listD.add(d1);

            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listD;
    }

    Boolean xoaD(String ma) {
        try {
            Connection con = dbc.getConnection();
            String sql = "delete Diem where masv=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ma);
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    Boolean suaD(DiemSinhVien d) {
        try {
            String sql = "update Diem set tienganh=?, tinhoc=?, gdtc=? where masv=?";
            Connection con = dbc.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, d.getTiengAnh());
            ps.setString(2, d.getTinHoc());
            ps.setString(3, d.getGDTC());
            ps.setString(4, d.getMa());
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    ArrayList<TaiKhoan> getListTK() {
        ArrayList<TaiKhoan> listTK = new ArrayList<>();
        try {
            Connection con = dbc.getConnection();
            String sql = "select * from TaiKhoan";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TaiKhoan t = new TaiKhoan();
                t.setTk(rs.getString(1));
                t.setMk(rs.getString(2));
                t.setRl(rs.getString(3));
                listTK.add(t);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return listTK;
    }

    ArrayList<DiemSinhVien> tenTang() {
        ArrayList<DiemSinhVien> list = new ArrayList<>();
        try {
            String sql = "select a.masv,hoten,tienganh,tinhoc,gdtc from Diem a\n"
                    + "join SinhVien b on a.masv=b.masv\n"
                    + "order by hoten ";
            Connection con = dbc.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DiemSinhVien d = new DiemSinhVien();
                d.setMa(rs.getString(1));
                d.setTen(rs.getString(2));
                d.setTiengAnh(rs.getString(3));
                d.setTinHoc(rs.getString(4));
                d.setGDTC(rs.getString(5));
                list.add(d);
            }
            con.close();
        } catch (Exception e) {
        }
        return list;
    }
    ArrayList<DiemSinhVien>xepDiem(ArrayList<DiemSinhVien> list){
        double diem=10.1;
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        
        ArrayList<DiemSinhVien> list1=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
         String a=  decimalFormat.format(diem-=0.1) ;
           
            for (DiemSinhVien d : list) {
               // try {
                    if (d.tb().equals(a)) {
                        
                    list1.add(d);
                }
              //  } catch (Exception e) {
               // }
                
            }
        }
        return list1;
    }
}
