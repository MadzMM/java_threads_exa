package exa4;

//example for start() vs run()
//start() is replaced with run() to see the purpose of start

public class Main {
    public static void main(String[] args){
        int n =5;
        for (int i=0; i<n; i++){
            ThreadTest object1 = new ThreadTest();
            ThreadTest object2 = new ThreadTest();

            object1.run();
            object2.run();
        }
    }
}
