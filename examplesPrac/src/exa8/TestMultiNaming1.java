package exa8;

public class TestMultiNaming1 extends Thread{
    public void run(){
        System.out.println("running...");
    }

    public static void main(String[] args){
        TestMultiNaming1 t1 = new TestMultiNaming1();
        TestMultiNaming1 t2 = new TestMultiNaming1();

        System.out.println("Name of t1: " + t1.getName());
        System.out.println("Name of t2: " + t2.getName());

        t1.start();
        t2.start();

        t1.setName("Customized Thread name 1");
        System.out.println("After changing the name of t1: " + t1.getName());
    }
}
