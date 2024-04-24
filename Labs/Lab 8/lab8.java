import java.util.Arrays;

public class lab8 {
    public int coinChange(int[] coins, int amount) {
        //dp array, stores the min # of coins needed for each amount
        int[] dp = new int[amount + 1];
        
        //Fils the dp array w/ a default value which is higher than the maximum possible value
        Arrays.fill(dp, amount + 1);
        
        //base case
        dp[0] = 0;

        for (int a = 1; a <= amount; a++) {
            //see if each coin can contribute to the amount
            for (int c : coins) {
                //check if coin is not larger than the amount 
                if (a - c >= 0) {
                    // Set the dp at index a to the minimum of its current value,
                    // or the value of dp[a - c] + 1 (1 represents using the coin c)
                    dp[a] = Math.min(dp[a], dp[a - c] + 1);
                }
            }
        }
        
        //If dp[amount] is still set to the default value, we return -1 as it's not possible to make change
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
