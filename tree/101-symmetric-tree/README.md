# 101. Symmetric Tree

## Solution: DFS
### Idea
- Compare the left and right subtrees
- If both nodes are null, return true
- If only one node is null, return false
- If their values are different, return false
- Recursively compare the mirrored nodes:
  + Left child of the left subtree with right child of the right subtree
  + Right child of the left subtree with left child of the right subtree
### Complexity
- Time: O(n)
- Space: O(n)