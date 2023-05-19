package MultiThreading;

// class myRun implements Runnable
// {
//     public void run(){ };
// }

class myThread1 extends Thread{
// how we can give name to my thread class -> by using constructor
    
    public myThread1(String name)
    {
        super(name);
        // setPriority(Thread.MAX_PRIORITY);

    }

    public void run() 
    {
        int c=1;
        while(true)
        {
            System.out.println(c++);
            try
            {

                Thread.sleep(1); // this throws an exception we have to handled it
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
public class ThreadTest4 {
    public static void main(String[] args) throws Exception
    {
        // // Thread t = new Thread("My name");
        // Thread t = new Thread(new myRun());

        myThread1 t = new myThread1("My Thread 1");
        t.start();
        t.interrupt();


        // t.setPriority(Thread.MAX_PRIORITY);
        // System.out.println("ID"+t.getId());
        // System.out.println("NAME"+t.getName());
        // System.out.println("PRIORITY"+t.getPriority());
        // t.start();
        // System.out.println("STATE"+t.getState());

        // System.out.println("ALIVE"+t.isAlive());


    }
}