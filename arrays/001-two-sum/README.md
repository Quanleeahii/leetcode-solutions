# 1. Two Sum

## Solution 1: Brute Force
### Idea
- Use 2 nested loops to check every pair of elements
- If a pair sums to the target, return their indices
- Otherwise, continue searching
### Complexity
Time: O(n^2)
Space: O(1)

## Solution 2: Hash Map
### Idea
- Traverse the array from left to right
- Calculate the complement: target - nums[i]
  + Check if the complement exists in the HashMap
  + If it exists, return the two indices
  + Otherwise, store the current number and its index in the HashMap
### Complexity
Time: O(n)
Space: O(n)


