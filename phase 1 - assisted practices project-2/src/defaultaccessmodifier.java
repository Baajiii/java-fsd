public class defaultaccessmodifier {
		void defaultclass()
		{
			System.out.println("i am default access modifier");
		}
		public static void main(String[] args) {
			defaultaccessmodifier o = new defaultaccessmodifier();
			o.defaultclass();	// default can access within package
			
		}

	}

