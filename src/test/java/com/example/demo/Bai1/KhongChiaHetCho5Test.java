package com.example.demo.Bai1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KhongChiaHetCho5Test {
    KhongChiaHetCho5 kkhongChiaHetCho5 = new KhongChiaHetCho5();
    @Test
    public void test01(){
        int kq = kkhongChiaHetCho5.khongchiahetcho5();
        assertTrue(kq > 2);
    }
    @Test
    public void test02(){
        int kq = kkhongChiaHetCho5.khongchiahetcho5();
        assertTrue(kq >= 50);
    }
    @Test
    public void test03(){
        int kq = kkhongChiaHetCho5.khongchiahetcho5();
        assertTrue(kq > 49);
    }
    @Test
    public void test04(){
        int kq = kkhongChiaHetCho5.khongchiahetcho5();
        assertTrue(kq > 3);
    }
    @Test
    public void test05(){
        int kq = kkhongChiaHetCho5.khongchiahetcho5();
        assertTrue(kq > 1);
    }

}