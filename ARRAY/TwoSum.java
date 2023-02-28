public class Solution{
	static int[] twoSum(int[] nums, int target) {
		int[] err= {0};
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int complement=target-nums[i];
			if(map.containsKey(complement)) {
				return new int[]{map.get(complement),i};
			}map.put(nums[i], i);
			
		}return err;
	}
	public static void main(String[] args) {
		int[] nums= {1,2,4,3};
		int target=6;
		System.out.println("Arrays- "+Arrays.toString(nums)+" Target- "+target);
		System.out.println("Index sum up- "+Arrays.toString(twoSum(nums,target)));
	}
}
