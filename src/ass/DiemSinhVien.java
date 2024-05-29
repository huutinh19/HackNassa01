/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ass;

import java.text.DecimalFormat;

/**
 *
 * @author ADMIN
 */
public class DiemSinhVien {

    
    private String ma,ten,tiengAnh,tinHoc,GDTC;

    public DiemSinhVien() {
    }

    public DiemSinhVien(String ma, String ten, String tiengAnh, String tinHoc, String GDTC) {
        this.ma = ma;
        this.ten = ten;
        this.tiengAnh = tiengAnh;
        this.tinHoc = tinHoc;
        this.GDTC = GDTC;
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

    public String getTiengAnh() {
        return tiengAnh;
    }

    public void setTiengAnh(String tiengAnh) {
        this.tiengAnh = tiengAnh;
    }

    public String getTinHoc() {
        return tinHoc;
    }

    public void setTinHoc(String tinHoc) {
        this.tinHoc = tinHoc;
    }

    public String getGDTC() {
        return GDTC;
    }

    public void setGDTC(String GDTC) {
        this.GDTC = GDTC;
    }

   

   
    String tb(){
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
         return decimalFormat.format(((Float.parseFloat(this.tiengAnh)) + (Float.parseFloat(this.tinHoc)) + (Float.parseFloat(this.GDTC)))/3);
    }
}
