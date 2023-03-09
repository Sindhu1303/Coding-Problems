public class Solution {
	   public static String longestCommonPrefix(String[] strs) {
	    if (strs == null || strs.length == 0) {
	        return "";
	    }
	    return divideAndConquer(strs, 0, strs.length - 1);
	}

	private static String divideAndConquer(String[] strs, int left, int right) {
	    if (left == right) {
	        return strs[left];
	    }
	    int mid = (left + right) / 2;
	    String leftPrefix = divideAndConquer(strs, left, mid);
	    String rightPrefix = divideAndConquer(strs, mid + 1, right);
	    return commonPrefix(leftPrefix, rightPrefix);
	}

	private static String commonPrefix(String left, String right) {
	    int minLen = Math.min(left.length(), right.length());
	    for (int i = 0; i < minLen; i++) {
	        if (left.charAt(i) != right.charAt(i)) {
	            return left.substring(0, i);
	        }
	    }
	    return left.substring(0, minLen);
	}


	   public static void main(String[] args) {
	      String[] strs={"flower","flot","flaw"};
	      System.out.println(longestCommonPrefix(strs));
	   }
	}
