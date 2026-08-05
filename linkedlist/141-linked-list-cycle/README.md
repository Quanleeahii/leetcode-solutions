# 141. Linked List Cycle

## Solution: Fast & Slow Pointer
### Idea
- Use two pointers:
  + `slow` moves one step at a time
  + `fast` moves two steps at a time
- If the linked list has a cycle, the fast pointer will eventually meet the slow pointer
- If the fast pointer reaches the end (`null`), the linked list has no cycle
### Complexity
- Time: O(n)
- Space: O(1)