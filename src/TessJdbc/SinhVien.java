/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TessJdbc;

import java.awt.Image;

/**
 *
 * @author ADMIN
 */
public class SinhVien {
    private String ma,ten,email,sdt,gioi,dia,hinh;
            private Image img;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, String email, String sdt, String gioi, String dia, String hinh, Image img) {
        this.ma = ma;
        this.ten = ten;
        this.email = email;
        this.sdt = sdt;
        this.gioi = gioi;
        this.dia = dia;
        this.hinh = hinh;
        this.img = img;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getGioi() {
        return gioi;
    }

    public void setGioi(String gioi) {
        this.gioi = gioi;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

   
}
