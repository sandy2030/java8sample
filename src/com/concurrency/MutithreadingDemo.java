package com.concurrency;


import java.util.ArrayList;

public class MutithreadingDemo {

    public static void main(String[] args) throws InterruptedException {

        PC pc =new PC();
        Runnable  t1=() -> {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        };
        Runnable t2=()->{
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread tx=new Thread(t1);
        Thread ty=new Thread(t2);
        tx.start();
        ty.start();
        tx.join();
        ty.join();


    }




}

class  PC {

    ArrayList<Integer> list=new ArrayList<>();
    int upperBound=5;
    int lowerBound=0;
    int value=0;

    void produce() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (list.size() == upperBound) {
                    wait();
                }
                list.add(value++);
                System.out.println("added element "+value);
                notify();
                Thread.sleep(3000);
            }
        }

    }

    void consume () throws InterruptedException {
        while(true) {
            synchronized (this) {
               // System.out.println(" witnin consumer ....");
                while (list.size() == lowerBound)
                    wait();
                Integer removedElement = list.remove(list.size() - 1);
                System.out.println("removedElement :: " + removedElement);
                notify();
                Thread.sleep(3000);
            }
        }
    }
}