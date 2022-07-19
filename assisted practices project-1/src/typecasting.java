import java.util.Scanner;

public class typecasting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// implicit casting
		System.out.println("coverting byte into int");
		System.out.println("Enter the byte value : ");
		byte b = sc.nextByte();

		int a = b;
		System.out.println("After casting value is " + a);
		// explicit casting
		System.out.println("converting int into byte");
		System.out.println("Enter the integer value : ");
		int c = sc.nextInt();
		byte e = (byte) c;
		System.out.println("After casting value is " + e);
		// converting string into primitive data types
		System.out.println("enter the string value: ");
		String s = sc.next();
		int j = Integer.parseInt(s);
		byte h = Byte.parseByte(s);
		System.out.println("string convert into integer " + j);
		System.out.println("string convert into byte " + h);
	}

}
