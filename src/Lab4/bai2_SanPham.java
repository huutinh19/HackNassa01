/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

/**
 *
 * @author ADMIN
 */
public class bai2_SanPham {
    private String ma,ten,nhaCC,donVT;
    private Integer donGia;

    public bai2_SanPham() {
    }

    public bai2_SanPham(String ma, String ten, String nhaCC, String donVT, Integer donGia) {
        this.ma = ma;
        this.ten = ten;
        this.nhaCC = nhaCC;
        this.donVT = donVT;
        this.donGia = donGia;
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

    public String getNhaCC() {
        return nhaCC;
    }

    public void setNhaCC(String nhaCC) {
        this.nhaCC = nhaCC;
    }

    public String getDonVT() {
        return donVT;
    }

    public void setDonVT(String donVT) {
        this.donVT = donVT;
    }

    public Integer getDonGia() {
        return donGia;
    }

    public void setDonGia(Integer donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "bai2_SanPham{" + "ma=" + ma + ", ten=" + ten + ", nhaCC=" + nhaCC + ", donVT=" + donVT + ", donGia=" + donGia + '}';
    }
    
    
}
