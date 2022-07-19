public class publicaccessmodifier {
	public void modifier(){
		System.out.println("i am public access modifier");
	}
	public static void main(String[] args) {
		publicaccessmodifier m = new publicaccessmodifier();
		m.modifier(); // public access can access any where
		System.out.println("hence proved");
	}

}