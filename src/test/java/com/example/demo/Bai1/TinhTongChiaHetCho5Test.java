package com.example.demo.Bai1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongChiaHetCho5Test {
    TinhTongChiaHetCho5 tinhTongChiaHetCho5 = new TinhTongChiaHetCho5();
    @Test
    public void test01(){
        int kq = tinhTongChiaHetCho5.tinhtong();
        assertTrue(kq > 3999);
    }
    @Test
    public void test02(){
        int kq = tinhTongChiaHetCho5.tinhtong();
        assertTrue(kq > 0);
    }
    @Test
    public void test03(){
        int kq = tinhTongChiaHetCho5.tinhtong();
        assertFalse(kq > 4001);
    }
    @Test
    public void test04(){
        int kq = tinhTongChiaHetCho5.tinhtong();
        assertTrue(kq > 3000);
    }
    @Test
    public void test05(){
        int kq = tinhTongChiaHetCho5.tinhtong();
        assertFalse(kq > 5000);
    }
}