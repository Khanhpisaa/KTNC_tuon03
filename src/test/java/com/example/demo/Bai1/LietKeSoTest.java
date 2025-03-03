package com.example.demo.Bai1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LietKeSoTest {
    LietKeSo lietKeSo = new LietKeSo();

    @Test
    public void testSoNhoNhat() {
        List<Integer> result = lietKeSo.lietKe();
        assertTrue(result.contains(1)); // Kiểm tra số nhỏ nhất có trong danh sách
    }

    @Test
    public void testSoLonNhat() {
        List<Integer> result = lietKeSo.lietKe();
        assertTrue(result.contains(99)); // Kiểm tra số lớn nhất không chia hết cho 5
    }

    @Test
    public void testSoChiaHetCho5() {
        List<Integer> result = lietKeSo.lietKe();
        assertFalse(result.contains(5)); // Kiểm tra số chia hết cho 5 không có trong danh sách
    }

    @Test
    public void testSoGan5() {
        List<Integer> result = lietKeSo.lietKe();
        assertTrue(result.contains(4)); // Kiểm tra số ngay trước 5 có trong danh sách
    }

    @Test
    public void testSoGan10() {
        List<Integer> result = lietKeSo.lietKe();
        assertTrue(result.contains(11)); // Kiểm tra số ngay sau 10 có trong danh sách
    }

}