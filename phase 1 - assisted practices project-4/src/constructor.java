
public class constructor {
	int z;
	 constructor(int a, int b)
	{
		z= a +b;
		this.z=z;
	}
	 public static void main(String[] args) {
		 constructor c = new constructor(5, 5);
		System.out.println(c.z);
	}

}
