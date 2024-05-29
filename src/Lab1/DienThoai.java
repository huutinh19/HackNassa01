/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class DienThoai implements  Serializable{
    private  String tenDT;
    private  int hangDT;
    private  float giaDT;

    public DienThoai() {
    }

    public DienThoai(String tenDT, int hangDT, float giaDT) {
        this.tenDT = tenDT;
        this.hangDT = hangDT;
        this.giaDT = giaDT;
    }

    public String getTenDT() {
        return tenDT;
    }

    public void setTenDT(String tenDT) {
        this.tenDT = tenDT;
    }

    public int getHangDT() {
        return hangDT;
    }

    public void setHangDT(int hangDT) {
        this.hangDT = hangDT;
    }

    public float getGiaDT() {
        return giaDT;
    }

    public void setGiaDT(float giaDT) {
        this.giaDT = giaDT;
    }
    
    public String status(){
        if(giaDT >= 10000){
            return "Sp tốt";
        }
        return "Sp không tốt";
    }
    
}
