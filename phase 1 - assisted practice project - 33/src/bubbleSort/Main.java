package bubbleSort;

public class Main {
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }
    public static void main(String[] args) {
		int a[]= {80,50,64,89,21,54,23,02,43};
		bubbleSort(a);
		for(int i =0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
