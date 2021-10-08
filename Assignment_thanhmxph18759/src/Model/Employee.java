package Model;

import java.io.Serializable;

/**
 *
 * @author XUÂN THÀNH
 */
public class Employee implements Serializable{
    private String manv, hoTen, Email;
    private double luong;
    private int tuoi;

    public Employee() {
    }

    public Employee(String manv, String hoTen, String Email, double luong, int tuoi) {
        this.manv = manv;
        this.hoTen = hoTen;
        this.Email = Email;
        this.luong = luong;
        this.tuoi = tuoi;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    
    
}
