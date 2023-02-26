public class Solution {
	static void reverseArray(int[] arr, int start, int end) {
	    while (start < end) {
	        int temp = arr[start];
	        arr[start] = arr[end];
	        arr[end] = temp;
	        start+=1;
	        end-=1;
	    }
	    PrintArray(arr);
	}
	static void PrintArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,6,7};
		System.out.println("Orginal Array: ");
		PrintArray(arr);
		int k=2;
		int n = arr.length;    
		// if k is greater than n, adjust it to the range [0, n)
		k = k % n;
		System.out.println("\nReversed array from 0 to n-k-1: ");
		// reverse the first n - k elements
		reverseArray(arr, 0, n - k - 1);    
		System.out.println("\nReversed array from 0 to n-k-1: ");
		// reverse the last k elements
		reverseArray(arr, n - k, n - 1);
		System.out.println("\nRotated array: ");
		// reverse the entire array
		reverseArray(arr, 0, n - 1);
		    
	}
}
