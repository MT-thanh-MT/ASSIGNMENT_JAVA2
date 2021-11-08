/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST;

import java.io.Serializable;

/**
 *
 * @author XUÂN THÀNH
 */
public class SinhVien implements Serializable{
    private String hoTen,nganhHoc;
    private double diem;
    
    public String getHocLuc(){
        String hocLuc = null;
        if (diem >= 9){
            hocLuc = "Xuất Sắc";
        } else if (diem >= 7){
            hocLuc = "Khá";
        } else if (diem >= 5){
            hocLuc = "Trung Bình";
        } else if (diem >= 3){
            hocLuc = "yếu";
        } else if (diem < 3){
            hocLuc = "kém";
        }
        return hocLuc;
    }
    
    public boolean getBonus(){
        return this.diem >= 7.5;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public SinhVien(String hoTen, String nganhHoc, double diem) {
        this.hoTen = hoTen;
        this.nganhHoc = nganhHoc;
        this.diem = diem;
    }

    public SinhVien() {
    }
}
