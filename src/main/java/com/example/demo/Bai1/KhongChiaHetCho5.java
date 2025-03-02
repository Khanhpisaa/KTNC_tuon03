package com.example.demo.Bai1;

public class KhongChiaHetCho5  {
    public static int khongchiahetcho5(){
        int sum = 0;
        for (int i = 1; i <= 50; i++){
            if (i%2 ==0 && i % 8 != 0){
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int kq = khongchiahetcho5();
        System.out.println(kq);
    }
}
