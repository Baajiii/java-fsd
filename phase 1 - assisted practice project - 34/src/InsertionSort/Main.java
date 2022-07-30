package InsertionSort;

public class Main {
	 public static void insertionSort(int array[]) {  
	        int n = array.length;  
	        for (int j = 1; j < n; j++) {  
	            int key = array[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array [i] > key ) ) {  
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = key;  
	        }  
	    } 
	 public static void main(String[] args) {
			int a[]= {80,50,64,89,21,54,23,02,43};
			insertionSort(a);
			for(int i =0;i<a.length;i++)
			{
				System.out.print(a[i] + " ");
			}
		}
}
