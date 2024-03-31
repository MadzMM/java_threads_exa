package myExp;

public class MyThread implements Runnable{
    @Override
    public void run(){
        System.out.println("Current Thread name: " + Thread.currentThread().getName());
        System.out.println("run() method called");
    }
}
