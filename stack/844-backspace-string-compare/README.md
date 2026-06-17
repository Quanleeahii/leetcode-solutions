# 844. Backspace String Compare

## Solution: History Tracking
### Idea
- Use a stack to stimulate typing
- When meeting '#', remove the previous character
- Otherwise, push the character into the stack
- Build the final string for both inputs and compare them
### Complexity
- Time: O(n)
- Space: O(n)