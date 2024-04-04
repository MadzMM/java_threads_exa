package exa17_Deadlock;

public class TestDeadlockExample1 {
    public static void main(String[] args){
        final String resource1 = "ratan";
        final String resource2 = "vimal";

        //t1 tries to lock resource1 then resource2
        Thread t1 = new Thread(){
            public void run(){
                synchronized (resource1){
                    System.out.println("Thread1: locked resource1");

                    try{
                        Thread.sleep(100);
                    }
                    catch (Exception e) {}

                    synchronized (resource2){
                        System.out.println("Thread1: locked resource2");
                    }
                }
            }
        };

        //t2 tries to lock resource2 then resource1
        Thread t2 = new Thread(){
            public void run(){
                synchronized (resource2){
                    System.out.println("Thread2: locked resource2");

                    try{
                        Thread.sleep(100);
                    }
                    catch (Exception e) {}

                    synchronized (resource1){
                        System.out.println("Thread2: locked resource1");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
