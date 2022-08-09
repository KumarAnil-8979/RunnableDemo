//i am using intellij ide for code
public class RunnableDemo {

    public static void main(String[] args)
    {
        System.out.println("ThreadName is: "
                + Thread.currentThread().getName());
        Thread t1 = new Thread(new RunnableDemo().new RunnableImpl());
        t1.start();
    }

    public class RunnableImpl implements Runnable {

        public void run()
        {
            System.out.println( "ThreadName  in run Method is: " +Thread.currentThread().getName());
        }
    }
}