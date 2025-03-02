package com.example.demo.Bai1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LietKeSoTest {
    LietKeSo lietKeSo = new LietKeSo();
    @Test
    public void test01(){
        List<Integer> list = lietKeSo.list();
        assertTrue(list.contains(99));
    }
    @Test
    public void test02(){
        List<Integer> list = lietKeSo.list();
        assertTrue(list.contains(2));
    }
    @Test
    public void test03(){
        List<Integer> list = lietKeSo.list();
        assertTrue(list.contains(4));
    }
    @Test
    public void test04(){
        List<Integer> list = lietKeSo.list();
        assertTrue(list.contains(6));
    }
    @Test
    public void test05(){
        List<Integer> list = lietKeSo.list();
        assertFalse(list.contains(100));
    }

}