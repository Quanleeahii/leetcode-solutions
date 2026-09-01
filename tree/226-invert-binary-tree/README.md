# 226. Invert Binary Tree

## Solution: DFS - Postorder
### Idea
- Recursively invert the left subtree
- Recursively invert the right subtree
- Swap the left and right children of the current node
- Return the root
### Complexity
- Time: O(n)
- Space: O(n)