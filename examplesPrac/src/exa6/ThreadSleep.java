package exa6;
import java.io.*;
import java.lang.Thread;

public class ThreadSleep extends Thread{
    public void run(){
        try{
            for(int i=0; i<5; i++){
               Thread.sleep(1000);
                //Thread.sleep(-100);
                System.out.println(i);
                System.out.println("Current thread name: " + Thread.currentThread().getName());
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
