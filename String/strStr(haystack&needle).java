public class Solution{
	static int strStr(String haystack, String needle) {
		// if small string len 0
		if(needle.length()== 0) {
			return 0;
		}
		// if small string length more than long string
		if(needle.length()>haystack.length()) {
			return -1;
		}
		
//		iterate longstring
		for(int i=0;i<=haystack.length()-needle.length();i++) {
			int j=0;
			
			for(j=0;j<needle.length();j++) {
				// if fisrt of small string matches with longstring j will be increased
				if(haystack.charAt(i+j) != needle.charAt(j)) {
					break;
				}
			}
			
			if(j==needle.length()) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
	String haystack = "codesad";
	System.out.println("Long String: "+haystack);
	String needle="sad";
	System.out.println("Small String :"+needle);
	System.out.println("Small string found at index "+strStr(haystack,needle));
	}
}
