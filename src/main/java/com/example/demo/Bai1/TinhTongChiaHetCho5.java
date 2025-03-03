package com.example.demo.Bai1;

public class TinhTongChiaHetCho5 {
    public static int tinhTong() {
        int sum = 0;
        for (int i = 2; i <= 50; i += 2) { // Chỉ lấy số chẵn
            if (i % 8 != 0) { // Loại bỏ số chia hết cho 8
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int ketQua = tinhTong();
        System.out.println("Tổng các số chẵn từ 1 đến 50 và không chia hết cho 8 là: " + ketQua);
    }
}
