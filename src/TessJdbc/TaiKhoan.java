/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TessJdbc;

/**
 *
 * @author ADMIN
 */
public class TaiKhoan {
    private String tk,mk,rl;

    public TaiKhoan(String tk, String mk, String rl) {
        this.tk = tk;
        this.mk = mk;
        this.rl = rl;
    }

    public TaiKhoan() {
    }

    public String getTk() {
        return tk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public String getRl() {
        return rl;
    }

    public void setRl(String rl) {
        this.rl = rl;
    }
    
}
