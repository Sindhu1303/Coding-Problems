public class Solution{
	static int singlenum(int[]arr){
		int result=0;
		for(int i=0;i<arr.length;i++) {
			result =result^arr[i];
		}
		return result;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,2,3,4,4};
		System.out.print("Single num: ");
		System.out.println(singlenum(arr));
	}
}
