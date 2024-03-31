package exa15_Synchronized_Block;

//synchronized block example using
//anonymous class

class Sender{
    public void SenderMsg(String msg){
        System.out.println("\nSending a msg: " + msg);

        try{
            Thread.sleep(800);
        }
        catch (Exception e){
            System.out.println("Thread interrupted.");
        }
        System.out.println("\n" + msg + "sent");
    }
}

//a sender class for sending a msg using threads
class SenderWThreads extends Thread{
    private String msg;
    Sender sd;

    //receiver method to receive a msg object
    //and a msg to be sent

    SenderWThreads(String m, Sender obj){
        msg = m;
        sd = obj;
    }

    public void run(){
        //checks that only one thread sends a msg
        //at a time
        synchronized (sd){
            //synchronizing the sender object
            sd.SenderMsg(msg);
        }
    }
}

//Driver code
public class TestSynchronizedBlock2 {
    public static void main(String[] args){
        Sender sender = new Sender();
        SenderWThreads sender1 = new SenderWThreads("Hola ", sender);

        SenderWThreads sender2 = new SenderWThreads("Welcome ", sender);

        //start two threads of SenderWThreads type
        sender1.start();
        sender2.start();

        //wait for threads to end
        try{
            sender1.join();
            sender2.join();
        }
        catch(Exception e){
            System.out.println("Interrupted");
        }
    }
}
