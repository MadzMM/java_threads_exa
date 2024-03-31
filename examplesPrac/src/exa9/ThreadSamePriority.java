package exa9;

import java.lang.*;
public class ThreadSamePriority extends Thread{
    public void run(){
        System.out.println("Inside the run() method");
    }

    public static void main(String[] args){
        Thread.currentThread().setPriority(7);
        System.out.println("Priority of the current thread - " + Thread.currentThread().getName() + ": " + Thread.currentThread().getPriority());

        ThreadSamePriority th1 = new ThreadSamePriority();
        System.out.println("th1 thread priority: " + th1.getPriority());
    }
}
