package arrayroatation;

public class RightRotation {

	static void rotatearray(int a[], int n, int b) {
		int i ;
		for(i =0;i<b;i++)
		{
			rightrotate(a,n);
		}}

	 static void rightrotate(int a[], int n) {
		int i;
		int temp = a[n - 1];
		for (i = n - 1; i > 0; i--,n--)
			a[i]=a[n-2];
		a[i]= temp;
	}


	public static void main(String[] args) {
		RightRotation rr = new RightRotation();
		int a[] = {5,2,1,3,4,5};
		int n =a.length;
	
		RightRotation.rotatearray(a,n,3);
		for(int i =0 ;i<n;i++)
		{
			System.out.print(a[i] + " ");
		}
	}

}
