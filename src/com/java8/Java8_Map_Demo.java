package com.java8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class Java8_Map_Demo{
    private static ReentrantLock lock=new ReentrantLock();
    static void write(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        Thread t1=new Thread(() -> method());t1.start();
        Thread t2=new Thread(() -> method());t2.start();
    }

    private static void method(){
        lock.lock();
        try {
            write("hi");
        }finally {
            lock.unlock();
        }
    }
}