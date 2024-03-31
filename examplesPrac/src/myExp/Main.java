package myExp;

//initiate threads via a loop
//runnable interface is the easier one

public class Main{
    public static void main(String[] args){
        for(int i=0; i<3; i++) {

            Thread t = new Thread(new MyThread());
            //t.run();
            t.start();
        }
    }
}
