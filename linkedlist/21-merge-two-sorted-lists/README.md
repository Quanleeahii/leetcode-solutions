# 21. Merge Two Sorted Lists

## Solution: Dummy Node
### Idea
- Create a dummy node to simplify building the merged list
- Use two pointers to traverse both sorted lists
- Always attach the node with the smaller value to the merged list
- Move the corresponding pointer forward
- After one list is exhausted, connect the remaining nodes of the other list
- Return the head of the merged list
### Complexity
- Time: O(n)
- Space: O(1)