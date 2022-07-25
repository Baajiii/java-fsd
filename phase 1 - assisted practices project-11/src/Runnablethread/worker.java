package Runnablethread;

public class worker implements Runnable {

	@Override
	public void run() {
		System.out.println("Worker Thread is start");
		String tname = Thread.currentThread().getName();
		for(int i=0; i<=10; i++)
		{
			System.out.println(tname + " i: " + i);
		}
		
	}

}
