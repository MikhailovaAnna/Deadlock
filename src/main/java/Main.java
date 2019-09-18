package main.java;

import java.util.Scanner;
import java.util.logging.Logger;

class Main
{
    public static void main(String[] args) {
        /*final Object obj1 = new Object();
        final Object obj2 = new Object();
        final Logger log = Logger.getLogger(Main.class.getName());
        final Thread thread1 = new Thread() {
            @Override
            public void run() {
                synchronized (obj1) {
                    System.out.println(currentThread().getName() + " got obj1");
                    try {
                        wait();
                    } catch (Exception ignored) {

                    }
                    System.out.println(currentThread().getName() + " trying to get obj2");
                    synchronized (obj2) {
                        System.out.println(currentThread().getName() + " got obj2");
                    }
                }
            }
        };

        final Thread thread2 = new Thread() {
            @Override
            public void run() {
                synchronized (obj2) {
                    System.out.println(currentThread().getName() + " got obj2");
                    try {
                        wait();
                    }
                    catch(Exception ignored)
                    {
                    }
                    System.out.println(currentThread().getName() + " trying to get obj1");
                    synchronized (obj1) {
                        System.out.println(currentThread().getName() + " got obj1");
                    }
                }
            }
        };
        thread1.start();
        thread2.start();*/

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of computer for cafe: ");
        int n = in.nextInt();
        System.out.print("Enter the number of tourists: ");
        int m = in.nextInt();
        ResourcePool rp = new ResourcePool(n, m);
        rp.journal();
    }
}