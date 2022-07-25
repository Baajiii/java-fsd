package synchronization;

public class displaymessage {
	public synchronized void display(String name) {
		String tname = Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println(tname +" " + i + "Hi i am " + name);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}
}
