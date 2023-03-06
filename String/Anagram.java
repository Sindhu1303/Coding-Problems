public class Solution{
	static boolean Anagram(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		// create a array of size 26 to store frq of each wrd in array
		int[] count=new int[26];
		for(int i=0;i<s.length();i++) {
			count[s.charAt(i)-'a']++;
			count[t.charAt(i)-'a']--;
		}
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String s="anagram";
		String t="naaramg";
		String s1="sindhu";
		String s2="indhui";
		System.out.println(Anagram(s,t));
		System.out.println(Anagram(s1,s2));
	}
}
