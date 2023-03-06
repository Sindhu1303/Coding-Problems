public class Solution{
	static int UniqnumF(String s) {
		//Create a array of size 26 to store frequency of each wrd in string
		int[] count = new int[26];
		// ascii value of wrd in string - asckii value of a
		for(int i=0;i<s.length();i++) {
			count[s.charAt(i)-'a']++;
		}
		//if array contains 1 means it presents 1 time in string
		for(int i=0;i<s.length();i++) {
			if(count[s.charAt(i)-'a']==1) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String s="leetcode";
		System.out.println("String :"+s);
		System.out.println("Index :"+UniqnumF(s));
	}
}
