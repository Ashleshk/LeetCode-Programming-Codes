def getDistinctGoodnessValues(arr):
    n = len(arr)
    dp = [set() for _ in range(n)]
    all_goodness_values = set()

    for i in range(n):
        current_val = arr[i]
        dp[i].add(current_val)
        
        for j in range(i):
            if arr[j] < current_val:
                for goodness in dp[j]:
                    dp[i].add(goodness | current_val)
        
        all_goodness_values.update(dp[i])
    
    all_goodness_values.add(0)  # include the goodness of the empty subsequence
    
    return sorted(all_goodness_values)

# Example usage:
#arr = [3,5,5,1]
#arr = [4,2,4,1]
arr = [3,2,4,6]
print(getDistinctGoodnessValues(arr))
