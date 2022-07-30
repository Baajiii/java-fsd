package LongestSubsequences;

public class MyClass {
	static int method(int a[], int len) {
		int s[] = new int[len];
		int i;
		int j;
		int max = 0;
		for (i = 0; i < len; i++)
			s[i] = 1;
		for (i = 1; i < len; i++)
			for (j = 0; j < i; j++)
				if (a[i] > a[j] && s[i] < s[j] + 1)
					s[i] = s[j] + 1;
		for (i = 0; i < len; i++)
			if (max < s[i])
				max = s[i];
		return max;
	}

	public static void main(String args[]) {
		int a[] = {3, 10, 2, 1, 20};
		int arr = a.length;
		System.out.println("The length of the longest increasing subsequence is " + method(a, arr));
	}
}
