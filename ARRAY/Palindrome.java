public class HundredDatastructures{
	static boolean isPalindrome(char[] arr) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			if(arr[i]!= arr[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		char[] arr = {'t','a','t','a','t'};
		if(isPalindrome(arr)) {
			System.out.println("yes it a palindrome");
		}else {
			System.out.println("No");
		}
	}
}
