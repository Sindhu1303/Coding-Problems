public class Solution{
	static void reverse(char[] s) {
		int i=0;
		int j=s.length-1;
		while(i<j) {
			char temp = s[i];
			s[i]=s[j];
			s[j]=temp;
			
			i++;
			j--;
		}
		System.out.println(Arrays.toString(s));
	}
	public static void main(String[] args) {
		String s="Hello";
		reverse(s.toCharArray());
		
	}
}
