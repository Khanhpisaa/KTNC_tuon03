package com.example.demo.Service;

import com.example.demo.Model.Sach;

import java.awt.desktop.OpenFilesEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SachSevice {
    private List<Sach> listSach = new ArrayList<>();

    public List<Sach> getAllSach(){
        return new ArrayList<>(listSach);
    }
    public void addSach(Sach sach){
        listSach.add(sach);
    }
    public boolean suaSach(Sach sach, String maMoi, String tenMoi, String tacGiaMoi, int namMoi, float giaMoi ){
//        for (Sach s : listSach){
//            if (s.getMa() == maMoi){
//                throw new IllegalArgumentException("Ma khong duoc trung nhau");
//            }
//            if (namMoi < 1990 || namMoi > 2025){
//                throw new IllegalArgumentException("nam khong hop le");
//            }
//            if (giaMoi < 10000 || giaMoi > 30000){
//                throw new IllegalArgumentException("gia khong hop le");
//            }
//        }
        sach.setMa(maMoi);
        sach.setTen(tenMoi);
        sach.setTacGia(tacGiaMoi);
        sach.setNamXuatBan(namMoi);
        sach.setGia(giaMoi);

    return true;
    }
    public boolean xoaSach(int nam){
        listSach.removeIf(s -> s.getNamXuatBan() == nam);
        return true;
    }
    Optional<Sach> timSachTheoNam(int nam){
        return listSach.stream().filter(s ->s.getNamXuatBan() == nam ).findFirst();
    }
}
