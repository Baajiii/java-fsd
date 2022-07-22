package thread;

public class myThread extends Thread{
	public static void main(String[] args) {
		String tname = Thread.currentThread().getName();
		System.out.println("main Thread is Running ");
		myThread mt = new myThread();
		mt.setName("Main Thread");
		mt.start();
		try {
			mt.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main Thread is ends...");
	}
	public void run()
	{
		String tname = Thread.currentThread().getName();
	
		System.out.println("Thread is running");
		for(int i=0 ; i<=10; i++)
		{
			System.out.println(tname + " : " + i);
		}
	}

}
