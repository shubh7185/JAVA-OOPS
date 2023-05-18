package MultiThreading;
class myThread extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println("hello");
            i++;
        }
    }
}


public class ThreadTest
{
    public static void main(String[] args) {
        myThread t = new myThread();
        t.start();;
        int i=1;
        while(true)
        {
            System.out.println("world");
            i++;
        }
    }
}