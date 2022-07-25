package polymorphism;

public class applelap {
	public static void main(String[] args) {
		macbook m = new macbookAir();
		m.start();
		m.stop();
		macbook m1 = new macbookPro();
		m1.start();
		m1.stop();
	}

}
