# 232. Implement Queue using Stacks

## Solution: Queue Simulation
### Idea
- Use two stacks
- The first stack stores newly added elements
- The second stack is used for removing and peeking
- When the second stack is empty, move all elements from the first stack to the second stack.
### Complexity
- Time: O(1)
- Space: O(n)