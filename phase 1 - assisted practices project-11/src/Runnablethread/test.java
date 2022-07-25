package Runnablethread;

public class test {
	public static void main(String[] args) {
		String tname = Thread.currentThread().getName();
		worker w = new worker();
		Thread t = new Thread(w);
		t.setName("Thread");
		t.start();
		
		System.out.println("Main Thread is running");
		for(int j =0 ; j<=10; j++)
		{
			System.out.println(tname + " j: " + j);
		}
		System.out.println("Main is end...");
	}

}
