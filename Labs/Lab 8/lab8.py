from ast import List

class lab8:
    def coinChange(self, coins: List[int], amount: int) -> int:
        dp = [amount +1 ] * (amount +1) 
        dp[0] = 0 # base case

        for a in range(1, amount +1):
            for c in coins:
                if a - c >= 0:
                    dp[a] = min(dp[a], 1 + dp[a-c])

        return dp[amount] if dp[amount] != amount +1 else -1
    #if we cant compute it return -1