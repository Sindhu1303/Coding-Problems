public class Solution{
	static int myAtoi(String s) {
		int index = 0, sign = 1, total = 0;
	    
	    // Step 1: Remove leading whitespace
	    while (index < s.length() && s.charAt(index) == ' ') {
	        index++;
	    }
	    
	    // Step 2: Determine sign (if any)
	    if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
	        sign = s.charAt(index) == '-' ? -1 : 1;
	        index++;
	    }
	    
	    // Step 3: Convert digits to integer
	    while (index < s.length() && s.charAt(index) >= '0' && s.charAt(index) <= '9') {
	        int digit = s.charAt(index) - '0';
	        
	        // Check for overflow
	        if (Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE % 10 < digit) {
	            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
	        }
	        
	        total = 10 * total + digit;
	        index++;
	    }
	    
	    // Step 4: Apply sign and check for overflow
	    return sign * total;
	}
	public static void main(String[] args) {
		String s="    -211111111111111111111111111111";
		System.out.println(myAtoi(s));
	}
}
