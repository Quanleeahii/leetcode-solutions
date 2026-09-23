# 235. Lowest Common Ancestor of a Binary Search Tree

## Solution: BST Search
### Idea
- Use the BST property to determine where `p` and `q` are located
- If both values are smaller than the current node, search the left subtree
- If both values are greater than the current node, search the right subtree
- Otherwise, the current node is the lowest common ancestor
### Complexity
- Time: O(log n) average, O(n) worst-case
- Space: O(log n) average, O(n) worst-case