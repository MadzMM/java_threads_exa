package examplesPrac.src.exa14_Synchronization;

/*program synchronized method by using
annonymous class */

class Table{

    //synchronized method
    synchronized void printTable(int n){
        for(int i=0; i<=5; i++) {
            System.out.println(n * i);

            try{
                Thread.sleep(400);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

public class TestSynchronization3 {
    public static void main(String[] args){

        //only one object
        final Table obj = new Table();

        Thread t1 = new Thread(){
            public void run(){
                obj.printTable(5);
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                obj.printTable(100);
            }
        };

        t1.start();
        t2.start();
    }
}
