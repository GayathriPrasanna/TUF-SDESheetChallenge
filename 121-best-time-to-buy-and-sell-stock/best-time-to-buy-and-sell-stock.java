
// class Solution 
// {
//     public int maxProfit(int[] prices) 
//     {
        
//         int n = prices.length;
//         int profit = 0;
//         int low= prices[0];
//         for(int i=0;i<n;i++){
//             int temp = prices[i]-low;
//             profit = Math.max(profit,temp);
//             low = Math.min(low,prices[i]);
                
//         }
//         return profit;
//     }
// }

// class Solution {
//     // Function to calculate max profit using brute force
//     public int stockbuySell(int[] prices) {
//         // Initialize max profit to 0
//         int maxProfit = 0;

//         // Loop through each day as a potential buy day
//         for (int i = 0; i < prices.length; i++) {
//             // Loop through each future day as a potential sell day
//             for (int j = i + 1; j < prices.length; j++) {
//                 // Calculate profit
//                 int profit = prices[j] - prices[i];

//                 // Update max profit if higher
//                 maxProfit = Math.max(maxProfit, profit);
//             }
//         }

//         // Return the maximum profit
//         return maxProfit;
//     }
// }

import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }
}

