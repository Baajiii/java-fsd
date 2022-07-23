package abstraction;

public class Test {

	public static void main(String[] args) {
		Car honda = new Honda();
		honda.go();
		honda.stop();
	
		Car car = new Toyota();
		car.go();
		car.stop();
	}
	
}