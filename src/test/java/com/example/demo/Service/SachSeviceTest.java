package com.example.demo.Service;

import com.example.demo.Model.Sach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class SachSeviceTest {

    Sach sach1, sach2,sach3,sach4,sach5;
    SachSevice sachSevice = new SachSevice();
    @BeforeEach
    void setUp() {


        sach1 = new Sach("Sach1","Conan","NamKhanh",1990,15000);
        sach2 = new Sach("Sach2","Conan","NamKhanh",1991,15000);
        sach3 = new Sach("Sach2","Conan","NamKhanh",2025,15000);
        sach4 = new Sach("Sach2","Conan","NamKhanh",2024,15000);
        sach5 = new Sach("Sach2","Conan","NamKhanh",2015,15000);
        sachSevice.addSach(sach1);
        sachSevice.addSach(sach2);
    }
    // test sửa
    @Test
    public void suaMaTrung(){
        boolean kq = sachSevice.suaSach(sach1,"Sach1","Conan","NamKhanh",2000,15000);
        assertTrue(kq);
        assertEquals(2,sachSevice.getAllSach().size());
    }
    @Test
    public void suaNamBienDuoi(){
        boolean kq = sachSevice.suaSach(sach1,"Sach3","Conan","NamKhanh",1990,15000);
        assertTrue(kq);
        assertEquals(2,sachSevice.getAllSach().size());
    }
    @Test
    public void  suaNamCanBienDuoi(){
        boolean kq = sachSevice.suaSach(sach1,"Sach3","Conan","NamKhanh",1991,15000);
        assertTrue(kq);
        assertEquals(2,sachSevice.getAllSach().size());
    }
    @Test
    public void suaNamBienTren(){
        boolean kq = sachSevice.suaSach(sach1,"Sach3","Conan","NamKhanh",2025,15000);
        assertTrue(kq);
        assertEquals(2,sachSevice.getAllSach().size());
    }
    @Test
    public void suaCanBienTren(){
        boolean kq = sachSevice.suaSach(sach1,"Sach3","Conan","NamKhanh",2024,15000);
        assertTrue(kq);
        assertEquals(2,sachSevice.getAllSach().size());
    }

    // theem
    @Test
    public void themBienDuoi(){
        Sach sach =  new Sach("Sach3","Conan","NamKhanh",1990,15000);
        sachSevice.addSach(sach);
        assertEquals(3,sachSevice.getAllSach().size());
    }
    @Test
    public void themGiaBienDuoi(){
        Sach sach =  new Sach("Sach3","Conan","NamKhanh",2000,10000);
        sachSevice.addSach(sach);
        assertEquals(3,sachSevice.getAllSach().size());
    }
    @Test
    public void themCanBienDuoi(){
        Sach sach =  new Sach("Sach3","Conan","NamKhanh",1991,15000);
        sachSevice.addSach(sach);
        assertEquals(3,sachSevice.getAllSach().size());
    }
    public void them(){
        Sach sach =  new Sach("Sach6","Conan","NamKhanh",1991,15000);
        sachSevice.addSach(sach);
        assertEquals(3,sachSevice.getAllSach().size());
    }
    @Test
    public void themBienTren(){
        Sach sach =  new Sach("Sach3","Conan","NamKhanh",2025,15000);
        sachSevice.addSach(sach);
        assertEquals(3,sachSevice.getAllSach().size());
    }
    @Test
    public void themCanBienTren(){
        Sach sach =  new Sach("Sach3","Conan","NamKhanh",2024,15000);
        sachSevice.addSach(sach);
        assertEquals(3,sachSevice.getAllSach().size());
    }
    // xoa
    @Test
    public void xoaNamBienDuoi(){
        boolean kq = sachSevice.xoaSach(1990);
        assertTrue(kq);
        assertEquals(1,sachSevice.getAllSach().size());
    }
    @Test
    public void xoaNamCanBienDuoi(){
        boolean kq = sachSevice.xoaSach(1991);
        assertTrue(kq);
        assertEquals(1,sachSevice.getAllSach().size());
    }
    @Test
    public void xoaNamBienTren(){
        boolean kq = sachSevice.xoaSach(1990);
        assertTrue(kq);
        assertEquals(1,sachSevice.getAllSach().size());
    }
    @Test
    public void xoaNamCanBienTren(){
        boolean kq = sachSevice.xoaSach(1990);
        assertTrue(kq);
        assertEquals(1,sachSevice.getAllSach().size());
    }@Test
    public void xoaNamHopLe(){
        boolean kq = sachSevice.xoaSach(1990);
        assertTrue(kq);
        assertEquals(1,sachSevice.getAllSach().size());
    }
    // tim kiem
    @Test
    public void timKiemNamBienDuoi(){
        Optional<Sach> kq = sachSevice.timSachTheoNam(1990);
        assertTrue(kq.isPresent(),"khong tim thay");
        assertEquals(1990,kq.get().getNamXuatBan());
    }
    @Test
    public void timKiemNamCanBienDuoi(){
        Optional<Sach> kq = sachSevice.timSachTheoNam(1991);
        assertTrue(kq.isPresent(),"khong tim thay");
        assertEquals(1991,kq.get().getNamXuatBan());
    }
    @Test
    public void timKiemNamBienTren(){
        Sach sach =  new Sach("Sach3","Conan","NamKhanh",2025,10000);
        sachSevice.addSach(sach);
        Optional<Sach> kq = sachSevice.timSachTheoNam(2025);
        assertTrue(kq.isPresent(),"khong tim thay");
        assertEquals(2025,kq.get().getNamXuatBan());
    }
    @Test
    public void timKiemCanNamBienTren(){
        Sach sach =  new Sach("Sach3","Conan","NamKhanh",2024,10000);
        sachSevice.addSach(sach);
        Optional<Sach> kq = sachSevice.timSachTheoNam(2024);
        assertTrue(kq.isPresent(),"khong tim thay");
        assertEquals(2024,kq.get().getNamXuatBan());
    }
    @Test
    public void timKiemNamHopLe(){
        Sach sach =  new Sach("Sach3","Conan","NamKhanh",2015,10000);
        sachSevice.addSach(sach);
        Optional<Sach> kq = sachSevice.timSachTheoNam(2015);
        assertTrue(kq.isPresent(),"khong tim thay");
        assertEquals(2015,kq.get().getNamXuatBan());
    }
}