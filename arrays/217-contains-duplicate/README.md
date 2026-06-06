# 217. Contains Duplicate

## Solution 1: Sorting
### Idea
- Sort the array 
- Traverse the array from left to right
- If two adjacent numbers are equal, return true;
- If no duplicate is found, return false
### Complexity
- Time: O(nlogn)
- Space: O(1)

## Solution 2: HashSet
### Idea
- Traverse the array from left to right
- If the current number already exists in HashSet, return true
- Otherwise, add it to the HashSet
- If no duplicate is found, return false
### Complexity
- Time: O(n)
- Space: O(n)
