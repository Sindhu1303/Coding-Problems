public class Solution{
	static int[] digit(int[] digits) {
		// traverse from back
		for(int i=digits.length-1;i>=0;i--) {
			// if example[4,5,6] last num increase to 7 return[4,5,7]
			if(digits[i]<9) {
				digits[i]++;
				return digits;
			}//else [4,5,9] return [4,5,0] and traverse to before number return [4,6,0]
			digits[i]=0;
		}
		// if [9,9,9] array will be [0,0,0] create new array with +1 length 
		//return digits with 0th as 1[1,0,0,0]
		digits = new int[digits.length+1];
		digits[0]=1;
		return digits;
	}
	
	public static void main(String[] args) {
		int [] digits= {1,2,4};
			      System.out.println(Arrays.toString(digit(digits)));
	}
}
