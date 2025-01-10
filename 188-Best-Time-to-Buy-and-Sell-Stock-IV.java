class Solution {
    
    public int maxProfit(int k, int[] prices) {
         

        int n = prices.length;
        
        if (n == 0 || k == 0) {
            return 0;
        }
        
        // Initialize arrays to track the maximum profit after each transaction
        int[] buyPrice = new int[k];
        int[] profit = new int[k];
        
        // Initialize buy prices to represent the highest possible integer value initially
        for (int i = 0; i < k; i++) {
            buyPrice[i] = Integer.MAX_VALUE;
            profit[i] = Integer.MIN_VALUE;
        }
        
        for (int price : prices) {
            
            //Loop is needed for dealing with k transactions.

            for (int i = 0; i < k; i++) {
                // Update buy[i] and profit[i] for each transaction

                buyPrice[i] = Math.min(buyPrice[i], price - (i > 0 ? profit[i - 1] : 0));
                profit[i] = Math.max(profit[i], price - buyPrice[i]);
            }

        }
        
        return profit[k - 1];
    }
 
}