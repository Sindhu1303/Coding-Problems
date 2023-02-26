public class Solution{
	static void intersect(int[] nums1, int[] nums2) {
		// Keep count of each ele in Array 1
		HashMap<Integer, Integer> map=new HashMap<>();
		//Store Interested elements
		ArrayList<Integer> intersect = new ArrayList<>();
		
		for(int i=0;i<nums1.length;i++) {
			if(map.containsKey(nums1[i])) {
				//if element already there, increase count
				map.put(nums1[i], map.get(nums1[i])+1);
			}else {
				//if not there add to map with count 1
				map.put(nums1[i],1);
			}
		}
		
		for(int i=0;i<nums2.length;i++) {
			if(map.containsKey(nums2[i])&& map.get(nums2[i]) > 0) {
				//if same ele in nums2 is there in nums1 add that to intersect arraylist
				intersect.add(nums2[i]);
				//reduce the count in map after adding
				map.put(nums2[i], map.get(nums2[i])-1);
			}
		}
		
		int[] result=new int[intersect.size()];
        for(int i=0;i<intersect.size();i++){
            result[i]=intersect.get(i);
            System.out.print(result[i]+" ");
        }
	}
	public static void main(String[] args) {
		int[] nums1= {1,2,3,2};
		int[] nums2 = {2,2};
		intersect(nums1,nums2);
	}
}
