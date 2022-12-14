/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baitapnhom.services;

import com.baitapnhom.doituong.Lop;
import com.baitapnhom.doituong.SinhVien;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HOME
 */
public class quanLySinhVien {
    private List<SinhVien> dsSinhVien = new ArrayList<>();
 
    
 
    
    public  void docDanhSachSinhVien() throws SQLException, ParseException{
        try (Connection conn = JdbcUtils.getConn()) {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM sinhvien");
            while (rs.next()) {
                int maSV = rs.getInt("MaSV");
                String hoSV = rs.getString("HoSV");
                String tenSV = rs.getString("TenSV");
                String gioiTinh = rs.getString("GioiTinh");
                String ngaySinh = rs.getString("NgaySinh");
                String queQuan = rs.getString("QueQuan");
                String maLop = rs.getString("MaLop");
                SinhVien sv = new SinhVien(maSV,hoSV,tenSV,gioiTinh,ngaySinh,queQuan,maLop);
                this.dsSinhVien.add(sv);
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public void hienThiDanhSach(){
        for(SinhVien sv : this.dsSinhVien){
            sv.hienThi();

        }
    }
}
