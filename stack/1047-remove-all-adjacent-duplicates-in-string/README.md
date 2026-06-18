# 1047. Remove All Adjacent duplicates In String

## Solution: History Tracking
### Idea
- Use a stack to store character
- If the current character matches the top of the stack, remove the top character
- Otherwise push the current character into the stack
- Build the final string from the remaining character in the stack
### Complexity
- Time: O(n)
- Space: O(n)