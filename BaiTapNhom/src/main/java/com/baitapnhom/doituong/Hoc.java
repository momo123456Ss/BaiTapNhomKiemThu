/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baitapnhom.doituong;
import com.baitapnhom.services.Menu;
import java.text.ParseException;
import java.util.Date;
/**
 *
 * @author HOME
 */
public class Hoc {
    private String maMH;
    private int maSV;
    private Date ngayDangKy;
    private double diem;
    public Hoc(String maMH,int maSV,String ngayDangKy,double diem) throws ParseException{
        this.maMH = maMH;
        this.maSV = maSV;
        this.ngayDangKy = Menu.F.parse(ngayDangKy);
        this.diem = diem;
    }
    
    public void hienThi(){
        System.out.printf("Ma mon hoc: %s - Ma sinh vien: %s - Ngay dang ky: %s - Diem: %.2f\n",this.maMH,this.maSV,Menu.F.format(this.ngayDangKy),this.diem);
    }
    /**
     * @return the maMH
     */
    public String getMaMH() {
        return maMH;
    }

    /**
     * @param maMH the maMH to set
     */
    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    /**
     * @return the maSV
     */
    public int getMaSV() {
        return maSV;
    }

    /**
     * @param maSV the maSV to set
     */
    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    /**
     * @return the ngayDangKy
     */
    public Date getNgayDangKy() {
        return ngayDangKy;
    }

    /**
     * @param ngayDangKy the ngayDangKy to set
     */
    public void setNgayDangKy(Date ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }
}
