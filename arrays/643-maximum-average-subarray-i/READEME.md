# 643. Maximum Average Subarray I

## Solution : Sliding Window
### Idea
- Use two pointers to fixed-size window
- Compute the sum of the first window
- Slide the window at one position at a time
- Remove the leftmost element and add the new rightmost element
- Keep track of the maximum widow sum
### Complexity
- Time: O(n)
- Space: O(1)