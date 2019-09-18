package main.java;

import java.util.Random;

public class ResourcePool {
    private int numOfComp; // количество компьютеров
    private int tourists; // количество туристов
    private boolean [] computers;
    private Thread [] threads;
    private int curTourist; // текущий претендент на компьютер
    private int curComp; // то, какой компьютер он занял

    ResourcePool(int n, int m){
        numOfComp = n;
        tourists = m;
        curTourist = 0;
        curComp = 0;
        computers = new boolean[numOfComp];
        threads = new Tourist[tourists];
    }

    // отмечаем, что данный компьютер занят
    public void compIsBusy(int i){
        computers[i] = true;
    }

    // отмечаем, что данный компьютер освободился
    public void compIsFree(int i){
        computers[i] = false;
    }

    // узнаем, есть ли свободные компьютеры
    public boolean anyFree(){
        for (int i = 0; i < numOfComp; i++){
            if (!computers[i])
                return true;
        }
        return false;
    }

    // узнаем, какой конкретно компьютер свободен
    public int whichIsFree(){
        for (int i = 0; i < numOfComp; i++){
            if (!computers[i])
                return i;
        }
        return -1;
    }


    class Tourist extends Thread{
        @Override
        public void run() {
            System.out.println(getName() + " is online.");
            Random rnd = new Random();
            try {
                int time = 1500 + rnd.nextInt(12000 - 1500);
                sleep(time);
                System.out.println(getName() + " is done, having spent " + time/100 +" minutes online.");
                compIsFree(curComp);
            }
            catch(InterruptedException e){}
        }
    }

    void journal(){
        while (curTourist != tourists) {
            if (anyFree()) {
                threads[curTourist] = new Tourist();
                String name = new String("Tourist" + curTourist);
                threads[curTourist].setName(name);
                curComp = whichIsFree();
                compIsBusy(curComp);
                threads[curTourist].start();
                curTourist++;
                for (int i = curTourist; i < tourists; i++)
                    System.out.println("Tourist"+ i + " waiting for turn.");
            }
        }
        try {
            for (int j = 0; j < tourists; j++) {
                threads[j].join();
            }
            System.out.println("The place is empty!");
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
