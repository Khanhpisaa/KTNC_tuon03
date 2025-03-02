package com.example.demo.Bai1;

public class TinhTongChiaHetCho5 {
    public static int tinhtong(){
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 5 != 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int kq = tinhtong();
        System.out.println(kq);
    }
}
