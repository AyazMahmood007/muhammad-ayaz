package com.company;

public class PrimeNum implements Runnable {
    int n=2;

    @Override
    public void run() {


            for(int n=2;n<=100;n++)
            {
                int count=0;
                for(int i=2;i<=n/2;i++)
                    if(n%i==0)
                    {
                        count++;
                        break;
                    }
                if(count==0)
                    System.out.println(n+" Number is prime");
            }

       }
}
 class Prime extends Thread {
     @Override
     public void run() {

         for (int n = 2; n <= 100; n++) {
             int count = 0;
             for (int i = 2; i <= n / 2; i++)
                 if (n % i == 0) {
                     count++;
                     break;
                 }
             if (count == 0)
                 System.out.println(n + " Number is prime");
         }

     }

 }