# 206. Reverse Linked List

## Solution: Iterative
### Idea
- Save the next node in a temporary variable to keep track of the remaining list
- Point the current node back to the reversed list
- Advance pointers forward and repeat until reaching null
- Return the last non-null node as the new head
### Complexity
- Time: O(n)
- Space: O(1)