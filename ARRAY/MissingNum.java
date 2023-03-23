public class HundredDatastructures{
	static int missingNum(int[] arr) {
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		for(int i:arr) {
			sum=sum-i;
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr= {2,4,3,5,6};
		System.out.println(missingNum(arr));
	}
}
