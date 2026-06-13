# 1456. Maximum Number of Vowels in a Substring of Given Length

## Solution: Sliding Window
### Idea
- Use two pointers to fixed-size window
- Count the vowels in the first window
- Slide the window one position at a time
- Remove the left character and add the new rightmost character
- Keep track of the maximum number of vowels
### Complexity
- Time: O(n)
- Space: O(1)