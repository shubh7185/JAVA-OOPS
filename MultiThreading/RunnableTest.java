package MultiThreading;
public class RunnableTest  implements Runnable{
    
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println("hello");
            i++;
        }
    }
    public static void main(String[] args) {
        
        RunnableTest t = new RunnableTest();
        Thread th = new Thread(t);
        th.start();
      
        int i=1;
        while(true)
        {
            System.out.println("world");
            i++;
        }
    }
}
