package exa10;

public class TestDaemonThread1 extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("Daemon Thread work");
        }
        else{
            System.out.println("User Thread work");
        }
    }
    public static void main(String[] args){
        TestDaemonThread1 t1 = new TestDaemonThread1();
        TestDaemonThread1 t2 = new TestDaemonThread1();
        TestDaemonThread1 t3 = new TestDaemonThread1();

        //setting t1 as a daemon thread
        t1.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();
    }
}
