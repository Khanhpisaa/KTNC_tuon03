package com.example.demo.Model;

import org.apache.tomcat.util.descriptor.web.SecurityRoleRef;

public class Sach {
    private String ma;
    private String ten;
    private String tacGia;
    private int namXuatBan;
    private float gia;

    public Sach() {
    }

    public Sach(String ma, String ten, String tacGia, int namXuatBan, float gia) {
        this.ma = ma;
        this.ten = ten;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.gia = gia;
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

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", namXuatBan=" + namXuatBan +
                ", gia=" + gia +
                '}';
    }
}
