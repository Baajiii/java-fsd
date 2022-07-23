package synchronization;

public class test {
	public static void main(String[] args) throws InterruptedException {
		String tname = Thread.currentThread().getName();
		displaymessage dm = new displaymessage();
		System.out.println("Main Thread is begin......");
		worker w = new worker(dm, "basith");
		worker w1 = new worker(dm, "abdul ");
		worker w2 = new worker(dm, "rifan");
		Thread t = new Thread(w);
		Thread t1= new Thread(w1);
		Thread t2 = new Thread(w2);
		t.start();
		t1.start();
		t2.start();
		t.setName("worker");
		System.out.println("Main Thread id ended.....");
	}
}
