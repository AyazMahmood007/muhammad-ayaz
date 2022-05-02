package com.company;

import java.util.ArrayList;

public class MyMarket {
    private ArrayList<String> fruits = new ArrayList<>();

    private int fruitNum;


    public MyMarket(int fruitNum) {

        if (fruitNum > 0) {

            this.fruitNum = fruitNum;

        } else {

            throw new IllegalArgumentException("This argument is not valid");

        }

    }


    private synchronized boolean isFull() {

        return fruits.size() == this.fruitNum;

    }

    private synchronized boolean isEmpty() {

        return fruits.isEmpty();

    }


    public synchronized void farmer(String fruit) {

        if (isFull()) {

            System.out.println("We can not accept more fruites at the moment !!");

            try {

                wait();

            } catch (InterruptedException e) {

                System.out.println("Interruption");

            }

        }

        fruits.add(fruit);

        System.out.printf("fruit : %s is added !!!%n", fruit);

    }

    public synchronized String consumer() {

        if (isEmpty()) {

            System.out.println("we don't have any goods yet");

            try {

                wait();

            } catch (InterruptedException e) {

                System.out.println("interruption occure !!!");

            }

        }

        String currentFruitRecusted = fruits.remove(0);

        notifyAll();

        return currentFruitRecusted;

    }
    public static void main(String[] args) {
        MyMarket superMarket= new MyMarket(10);
        superMarket.farmer("apple");
        superMarket.consumer();

    }

}


