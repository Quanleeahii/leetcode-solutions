# 100. Same Tree

## Solution: DFS - Recursion
### Idea
- If both nodes are null, return true
- If only one node is null, return false
- If the values are different, return false
- Recursively compare the left subtrees
- Recursively compare the right subtrees
- Both subtrees must be the same
### Complexity
- Time: O(n)
- Space: O(n)