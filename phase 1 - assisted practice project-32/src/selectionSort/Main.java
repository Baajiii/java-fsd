package selectionSort;

public class Main {
public  void selectionsort(int arr[]) {
	for(int i= 0;i<arr.length-1;i++) {
		int s = i;
		for(int j = i+1;j<arr.length;j++) {
			if(arr[s]>arr[j]) {
				s=j;
			}}
			int temp = arr[s];
			arr[s]= arr[i];
			arr[i]=temp;
		
	}
}
public static void main(String[] args) {
	Main m = new Main();
	int a[]= {2,8,6,5,9,3,1};
	m.selectionsort (a);
	for(int i=0;i<a.length;i++) {
	System.out.print(a[i] + " ");
}
}}
