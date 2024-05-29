/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

/**
 *
 * @author ADMIN
 */
public class Student {
    private String ma,ten,email,sdt,dc;
    private boolean gt;

    public Student() {
    }

    public Student(String ma, String ten, String email, String sdt, String dc, boolean gt) {
        this.ma = ma;
        this.ten = ten;
        this.email = email;
        this.sdt = sdt;
        this.dc = dc;
        this.gt = gt;
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

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public Boolean getGt() {
        return gt;
    }

    public void setGt(Boolean gt) {
        this.gt = gt;
    }
    
}
    