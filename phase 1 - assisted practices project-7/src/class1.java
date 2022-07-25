public class class1 {

	class Inner {
		void hello() {
			System.out.println(" i am a inner class");
		}
	}
	class Inner2{
		void display() {
			System.out.println(" i am a inner class2");
		}
	}

	public static void main(String[] args) {

		class1 o = new class1();
		class1.Inner i = o.new Inner();
		i.hello();
		class1.Inner2 n = o.new Inner2();
		n.display();
		
	}
}
