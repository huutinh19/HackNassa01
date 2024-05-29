/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyenTap;

/**
 *
 * @author ADMIN
 */
public class LT {
    private String ma,ten;
    private Float gia;
    private Boolean th;

    public LT() {
    }

    public LT(String ma, String ten, Float gia, Boolean th) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.th = th;
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

    public Float getGia() {
        return gia;
    }

    public void setGia(Float gia) {
        this.gia = gia;
    }

    public Boolean getTh() {
        return th;
    }

    public void setTh(Boolean th) {
        this.th = th;
    }

   Float tong(){
       return this.gia*2;
   }
    
}
