public class Solution{
	static int[] zero(int[] nums) {
	int j=0;
	int i=0;
	while(i<nums.length) {
		if(nums[i]!=0) {
			
			int temp=nums[j];
			nums[j]=nums[i];
			nums[i]=temp;
			j++;
		}
		i++;
		}
	return nums;
	}
	public static void main(String[] args) {
		int[] nums= {1,0,2,0,4,4};
		System.out.println(Arrays.toString(zero(nums)));
	}
}
