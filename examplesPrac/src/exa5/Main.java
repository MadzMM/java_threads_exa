package exa5;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

//start() and run() explanation
//if the start() is not called it won't create any Thread,
//The program will run on the main thread
//no multithreading takes place without start()

public class Main {
    public static void main(String[] args){
        MyThread t = new MyThread();
       // t.start();

        t.run();
    }
}
