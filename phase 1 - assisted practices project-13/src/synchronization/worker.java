package synchronization;

public class worker implements Runnable {
	String name;
	displaymessage dm;
	worker(displaymessage dm, String name)
	{
		this.dm= dm;
		this.name = name;
	}

	public void run() {

		dm.display(name);
	}
}
