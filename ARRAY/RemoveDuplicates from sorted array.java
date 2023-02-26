public class Solution {
    static int removeduplicates(int[] nums){
        int count=1;
        System.out.println("Array After removing duplicates");
        for(int i=0; i<nums.length-1;i++){
            if (nums[i] != nums[i+1]){
                nums[count]=nums[i+1];
               
                System.out.print(nums[i]+" ");
                count++;
            }   
        }
        System.out.print(nums[nums.length-1]);
        System.out.println();
        System.out.println("Total numbers in array ");
        return count;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,4};
        System.out.println("Original Array");
        for(int i=0;i<nums.length;i++) {
        	System.out.print(nums[i]+" ");
        }
        System.out.println(" ");
        System.out.println(removeduplicates(nums));
     }
}
