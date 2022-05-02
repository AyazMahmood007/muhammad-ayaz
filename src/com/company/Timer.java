package com.company;

public class Timer implements Runnable {


    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("Timeout Message");


            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Timer test= new Timer();
       // Thread t1= new Thread(test);
        test.run();

    }
}





