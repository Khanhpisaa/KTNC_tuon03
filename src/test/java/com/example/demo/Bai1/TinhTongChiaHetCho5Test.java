package com.example.demo.Bai1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongChiaHetCho5Test {
    TinhTongChiaHetCho5 tinhTongSoChan = new TinhTongChiaHetCho5();

    @Test
    public void testGiaTriDung() {
        int kq = tinhTongSoChan.tinhTong();
        assertEquals(588, kq); // Kết quả đúng là 588
    }

    @Test
    public void testKhongAm() {
        int kq = tinhTongSoChan.tinhTong();
        assertTrue(kq >= 0); // Tổng không thể âm
    }

    @Test
    public void testNhoHon600() {
        int kq = tinhTongSoChan.tinhTong();
        assertTrue(kq < 600); // Tổng phải nhỏ hơn 600
    }

    @Test
    public void testLonHon500() {
        int kq = tinhTongSoChan.tinhTong();
        assertTrue(kq > 500); // Tổng phải lớn hơn 500
    }

    @Test
    public void testKhac500() {
        int kq = tinhTongSoChan.tinhTong();
        assertNotEquals(500, kq); // Tổng không thể là 500
    }
}