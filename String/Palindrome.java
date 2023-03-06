public class Solution{
	static boolean ispalindrome(String s) {
		s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		int i=0;int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		String s="a mam, a";
		String s1="a man, a";
		System.out.println(ispalindrome(s));
		System.out.println(ispalindrome(s1));
	}
}
