package exa6;

public class Main1 {
    public static void main(String[] args){
        ThreadSleep obj1 = new ThreadSleep();
        ThreadSleep obj2 = new ThreadSleep();

        obj1.start();
        obj2.start();

        //obj1.run();

    }
}
