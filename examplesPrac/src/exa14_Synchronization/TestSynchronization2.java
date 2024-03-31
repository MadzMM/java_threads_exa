package examplesPrac.src.exa14_Synchronization;

//example of java synchronized method

class Table1{

    //synchronized method
    synchronized void printTable(int n){
        for(int i=1; i<=5; i++){
            System.out.println(n*i);

            try{
                Thread.sleep(400);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class MyThread1 extends Thread{
    Table1 t;

    /*this is the constructor for MyThread1
    it takes a 'Table' object as an argument and
    assigns it to the 't' member variable. This allows
    you to pass a 'Table' object to 'MyThread1' when
    you create an instance of it */
    MyThread1(Table1 t){
        this.t =t;
    }
    public void run(){
        t.printTable(5);
    }
}

class MyThread2 extends Thread{
    Table1 t;
    MyThread2(Table1 t){
        this.t =t;
    }

    public void run(){
        t.printTable(100);
    }
}

public class TestSynchronization2 {
    public static void main(String[] args){
        Table1 obj = new Table1();

        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start();
        t2.start();
    }
}

/*  Since the printTable method of the Table class
 is synchronized, only one thread can execute this
 method on a given Table object at a time. This
 ensures that the output of the two threads is
 interleaved and doesn't overlap, demonstrating
 thread synchronization.
 */
