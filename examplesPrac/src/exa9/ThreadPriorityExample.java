package exa9;

import java.lang.*;
public class ThreadPriorityExample extends Thread{
    //method 1
    //whenever the start() method is called by a thread
    //the run() method is invoked

    public void run(){
        System.out.println("Inside the run() method");
    }

    public static void main(String[] args){
        ThreadPriorityExample th1 = new ThreadPriorityExample();
        ThreadPriorityExample th2 = new ThreadPriorityExample();
        ThreadPriorityExample th3 = new ThreadPriorityExample();

        //we did not mention the priority of the thread
        //default is 5

        //display priorities
        System.out.println("th1 priority: " + th1.getPriority());
        System.out.println("th2 priority: " + th2.getPriority());
        System.out.println("th3 priority: " + th3.getPriority());

        th1.setPriority(6);
        th2.setPriority(3);
        th3.setPriority(9);

        //display priorities after set
        System.out.println("th1 priority: " + th1.getPriority());
        System.out.println("th2 priority: " + th2.getPriority());
        System.out.println("th3 priority: " + th3.getPriority());

        //displaying name of the currently executing thread
        System.out.println("Currently executing thread: " + Thread.currentThread().getName());
        System.out.println("Priority of the main thread: " + Thread.currentThread().getPriority());

        //set main thread priority to 10
        Thread.currentThread().setPriority(10);
        System.out.println("Main thread priority now: " + Thread.currentThread().getPriority());
    }
}
