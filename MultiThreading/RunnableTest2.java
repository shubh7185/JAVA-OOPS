package MultiThreading;
class myThread implements Runnable
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


public class RunnableTest2 
{
    public static void main(String[] args) {

        myThread t = new myThread();
        Thread th= new Thread(t);
        th.start();
        int i=1;
        while(true)
        {
            System.out.println("world");
            i++;
        }
    }
}


