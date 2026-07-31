# 83. Remove Duplicates from Sorted List

## Solution: Linked List Traversal
### Idea
- Traverse the linked list using pointers
- Skip consecutive duplicate nodes
- Connect the current node to the next distinct node
- Continue until reaching the end of the list
### Complexity
- Time: O(n)
- Space: O(1)