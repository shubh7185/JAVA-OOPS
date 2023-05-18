package MultiThreading;
public class ThreadTest2 extends Thread
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
    public static void main(String[] args) {
        ThreadTest2 t = new ThreadTest2();
        t.start();
        
        int i=1;
        while(true)
        {
            System.out.println("world");
            i++;
        }
    }
}
