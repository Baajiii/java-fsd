package OrderSatistics;

import java.util.Arrays;

public class MyClass {
	int a[] = {5,6,5,4,3,8,1,2};
	void sorting() {
		Arrays.sort(a);
	}
	void fourthElement() {
		System.out.println("Fourth smallest Element the array is " + a[3]);
		
	}
	public static void main(String[] args) {
		MyClass C = new MyClass();
		C.sorting();
		C.fourthElement();
		
	}

}
