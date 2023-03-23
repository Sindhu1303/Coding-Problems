public class HundredDatastructures{
	static int secMax(int[] arr) {
		int max=Integer.MIN_VALUE;
		int secmax = Integer.MIN_VALUE;
		for(int i=0; i<arr.length;i++) {
			if(arr[i] > max) {
				secmax = max;
				max = arr[i];
			}else if(arr[i] >secmax && arr[i] != max) {
				secmax = arr[i];
			}
		}	
		return secmax;
	}
	public static void main(String[] args) {
		int[] arr = {1,5,34,2,1};
		System.out.println(secMax(arr));
	}
}
