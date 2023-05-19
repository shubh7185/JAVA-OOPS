package MultiThreading;

class myThread extends Thread{

    // public myThread(String name)
    // {
    //     super(name);

    // }
    public void run() 
    {
        int c=1;
        while(true)
        {
            System.out.println(c++ + "MY THREAD");
        }
    }
}
public class ThreadTest5 {
    public static void main(String[] args) throws Exception
    {
        myThread t = new myThread();
        // t.setDaemon(true);
        t.start();
        // Thread mainThread= Thread.currentThread(); // this gives the refrence of current thread demon thread
        // mainThread.join();
        // // try
        // // {
        // //     Thread.sleep(100); // now its print till 100 milisecond and then stop because we use demon
        // // }
        // // catch(Exception e)
        // // {
        // //     System.out.println(e);
        // // }

        // ---------------------------------------------
        int c=1;
        while(true)
        {
            System.out.println(c++ + "Main");
            Thread.yield();// more time is given to main thread in the cpu my thread run more  number of times than main thread

        }
    }
}