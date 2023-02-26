public class Solution {
	static int profit(int[] prices) {
        int profit = 0;
        int n = prices.length;

        for (int i = 1; i < n; i++) {
            if (prices[i-1] < prices[i]) {
                profit += prices[i]-prices[i-1];
            }}
        return profit;
	}
public static void main(String[] args) {
	int[] prices = {1,2,3,4,5};
	System.out.println("Original Array");
	for(int i=0; i<prices.length;i++) {
		System.out.print(prices[i]+" ");
	}
	System.out.println("\n"+"Maximum profit: ");
	System.out.println(profit(prices));
}
}
