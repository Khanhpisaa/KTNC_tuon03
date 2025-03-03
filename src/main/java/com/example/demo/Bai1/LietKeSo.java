package com.example.demo.Bai1;

import java.util.ArrayList;
import java.util.List;

public class LietKeSo {
    public static List<Integer> lietKe() {
        List<Integer> danhSach = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (i % 5 != 0) { // Bỏ qua số chia hết cho 5
                danhSach.add(i);
            }
        }
        return danhSach;
    }

    public static void main(String[] args) {
        List<Integer> ketQua = lietKe();
        System.out.println("Các số từ 1 đến 100 không chia hết cho 5:");
        System.out.println(ketQua);
    }
}
