# 225. Implement Stack using Queues

## Solution: Stack Simulation
### Idea
- Use one queue to simulate a stack.
- After pushing a new element, rotate the queue so the new element moves to the front.
- The front of the queue always represents the top of the stack.
### Complexity
- Empty: O(1)
- Space: O(n)