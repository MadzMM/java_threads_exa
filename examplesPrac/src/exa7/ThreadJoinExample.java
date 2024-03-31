package exa7;

public class ThreadJoinExample {
    public static void main(String[] args){

        //creating 3 threads
        ThreadJoin th1 = new ThreadJoin();
        ThreadJoin th2 = new ThreadJoin();
        ThreadJoin th3 = new ThreadJoin();

        //start th1 thread
        th1.start();

        try{
            System.out.println("The current thread name is: " + Thread.currentThread().getName());

            //invoking the join() method
            th1.join();
        }
        catch(Exception e){
            System.out.println("The exception has been caught: " + e);
        }

        //start th2 thread
        th2.start();

        try{
            System.out.println("The current thread name is: " + Thread.currentThread().getName());
            th2.join();
        }
        catch(Exception e){
            System.out.println("The exception has been caught: " + e);
        }

        //start th3 thread
        th3.start();
    }
}
