package com.company;

public class PrimeTest {
    public static void main(String[] args) {
        Prime p1=new Prime();
        PrimeNum p2= new PrimeNum();

        Thread t1= new Thread(p1);
        Thread t2 =new Thread(p2);
        t1.start();
        t2.start();

    }
}
