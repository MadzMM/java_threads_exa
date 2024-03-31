package exa2;

public class ImplementRunnableInferface {
    public static void main(String[] args){

        //creating object of our thread class inside main()
        ThreadUsingInterface obj = new ThreadUsingInterface();

        //passing the object to thread in main()
        Thread myThread = new Thread(obj);

        //starting the thread
        myThread.start();
    }
}
