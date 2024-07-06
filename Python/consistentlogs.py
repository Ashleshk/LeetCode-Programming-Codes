def findConsistentLogs(userEvent):
    from collections import defaultdict, Counter

    n = len(userEvent)
    if n == 0:
        return 0

    # Step 1: Calculate the minimum frequency in the entire array
    freq = Counter(userEvent)
    min_freq = min(freq.values())

    # Step 2: Use sliding window to find the longest subarray with required property
    left = 0
    max_length = 0
    current_freq = defaultdict(int)

    for right in range(n):
        current_freq[userEvent[right]] += 1
        
        while max(current_freq.values()) > min_freq:
            current_freq[userEvent[left]] -= 1
            if current_freq[userEvent[left]] == 0:
                del current_freq[userEvent[left]]
            left += 1
        
        # Check if the current window is valid
        if max(current_freq.values()) == min_freq:
            max_length = max(max_length, right - left + 1)

    return max_length

# Example usage:
userEvent = [1, 2, 1, 3, 4, 2, 4, 3, 3, 4]
#userEvent = [9,9,9]
print(findConsistentLogs(userEvent))  # Output: 8
