# 739. Daily Temperatures

## Solution: Monotonic Stack
### Idea
- Use a stack to store indices of temperatures that have not found a warmer day yet
- Keep the stack in decrease order of temperatures
- When a warmer temperature is found
  + Update the answer for previous temperatures
  + Remove the form the stack
- Push the current index into the stack
### Complexity
- Time: O(n)
- Space: O(n)