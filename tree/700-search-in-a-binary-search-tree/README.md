# 700. Search in a Binary Search Tree

## Solution: BST Search
### Idea
- If the current node is null or its value equals the target, return the current node
- If the target is smaller than the current value, search the left subtree
- Otherwise, search the right subtree
- Use the BST property to search only one subtree at each step
### Complexity
- Time: O(h)
- Space: O(h)