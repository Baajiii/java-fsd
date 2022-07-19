package package1;

public class privateaccessmodifier {
		private void method() {
			System.out.println("i am private access modifier ");
		}
		protected void method2() {
			System.out.println("i am protected access modifier ");
		}
		public static void main(String[] args) {
			privateaccessmodifier p = new privateaccessmodifier();
			p.method();	// private can access with in the class
		}

	}
