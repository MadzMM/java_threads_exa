package exa12;

// printing even and odd numbers using two threads

public class OddEvenExample {
    //starting the counter
    int contr = 1;
    static int NUM;

    //method for printing the odd numbers
    public void displayOddNumber(){

        //note that synchronized blocks are necessary for the code for
        //getting the desired output. If we remove
        //synchronizes blocks, we will get an exception

        synchronized (this){
            //printing the numbers till NUM
            while(contr<NUM){
                while(contr % 2 == 0){
                    //handling the exception handle
                    try{
                        wait();
                    }
                    catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                }

                //printing the number
                System.out.print(contr + " ");

                //incrementing the contr
                contr = contr +1;

                //notifying the thread which is waiting
                //for this lock

                notify();
            }
        }
    }

    //Method for printing the even numbers
    public void displayEvenNumber(){
        synchronized (this){
            while(contr < NUM){
                while(contr%2 == 1){
                    try{
                        wait();
                    }
                    catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                }
                //printing the number
                System.out.print(contr + " ");

                //incrementing the contr
                contr = contr +1;

                //notifying to the 2nd thread
                notify();
            }
        }
    }

    //main method
    public static void main(String[] args){

        //the num is given
        NUM = 20;

        //creating an object of the class OddEvenExample
        OddEvenExample oe = new OddEvenExample();

        //creating a thread th1
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //invoking the method to display even num
                //using the thread th1

                oe.displayEvenNumber();
            }
        });

        //creating a thread th2
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                //invoking the method to display odd num
                //using the thread th2
                oe.displayOddNumber();
            }
        });

        //starting both of the threads
        th1.start();
        th2.start();
    }
}
