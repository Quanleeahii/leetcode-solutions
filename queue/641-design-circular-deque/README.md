# 641. Design Circular Deque

## Solution: Circular Array
### Idea
- Store elements in a fixed-size circular array
- Maintain two pointers front and rear for both ends
- Move pointers circularly when inserting or deleting
- Handle empty and full deque separately
### Complexity
- Time: O(1)
- Space: O(n)