
public class methods {
	int z;
	public void method()
	{
		System.out.println("i am method 1");
	}
	public int hello(int a, int b) {
		z=a + b;
	return z;
	}
	public static void main(String[] args) {
		System.out.println("i am calling methods");
		methods m =new methods();
		m.method();
		System.out.println(m.hello(5, 6));
	}

}
