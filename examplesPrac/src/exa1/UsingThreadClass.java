package exa1;

public class UsingThreadClass {
    public static void main(String[] args){

        //creating object of out thread class inside the main()
        MyThread myThread = new MyThread();

        //starting the thread
        myThread.start();
    }
}
