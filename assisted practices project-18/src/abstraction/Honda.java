package abstraction;

public class Honda implements Car {
	
	final int numWheels = 4;

	public void go() {
		System.out.println("Inside Honda Go");
	}
	public void stop() {
		System.out.println("Inside Honda Stop");
	}
	
	public void modifyCar() {
//		numWheels = 5;
	}

}