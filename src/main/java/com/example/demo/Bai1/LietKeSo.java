package com.example.demo.Bai1;

import java.util.ArrayList;
import java.util.List;

public class LietKeSo {
    public List<Integer> list(){
        List<Integer> kq = new ArrayList<>();
        for (int i=0; i<=100; i++){
            if (i % 5 != 0){
                kq.add(i);
            }
        }
        return kq;
    }

    public static void main(String[] args) {
        List<Integer> kq = new ArrayList<>();
        for (int i=0; i<=100; i++){
            if (i % 5 != 0){
                kq.add(i);
            }
        }
        System.out.println(kq);
    }
}
