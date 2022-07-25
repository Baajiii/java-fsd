package Sleepandwait;

public class sleepandwaitt {
	private static Object L = new Object();
    public static void main(String args[]) throws InterruptedException
    {
    	String name = Thread.currentThread().getName();
        Thread.sleep(1000);
        System.out.println(name + " i am going to sleep and come in a second");
        synchronized (L) 
        {
            L.wait(1000);
            System.out.println(" i am going to wait for one second ");
        }
    }
}
