/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onTap;

/**
 *
 * @author HuuTinh
 */
public class DienThoai {
    private String tenSP;
    private String hang;
    private float gia;

    public DienThoai() {
    }

    public DienThoai(String tenSP, String hang, float gia) {
        this.tenSP = tenSP;
        this.hang = hang;
        this.gia = gia;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "DienThoai{" + "tenSP=" + tenSP + ", hang=" + hang + ", gia=" + gia + '}';
    }

    
    
}
