# 1. Two Sum

## Pattern
Array

## Solution 1: Brute Force
### Idea
- Use 2 nested loops to check every pair of elements
- If nums[i] + nums[j] == target, return their indices
- Otherwise, continue searching
### Complexity
Time: O(n^2)
Space: O(1)
### Notes:
- When n is large, this solution becomes slow
- We can optimize it to O(n) using a HashMap

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
### Notes:
- HashMap provides average O(1) lookup time
- Store the information that needs to be searched as the key
- Trading extra space for faster lookup is a common optimization technique

