package exa12;

public class TestMultitasking2 implements  Runnable{
    public void run(){
        System.out.println("task one");
    }

    public static void main(String[] args){
        Thread t1 = new Thread(new TestMultitasking2());

        //method 2
        //TestMultitasking2 obj = new TestMultitasking2();
        //Thread t1 = new Thread(obj);
        //t1.start();

        Thread t2 = new Thread(new TestMultitasking2());

        t1.start();
        t2.start();
    }
}
