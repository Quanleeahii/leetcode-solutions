# 104. Maximum Depth of Binary Tree

## Solution: DFS Recursion
### Idea
- If the current node is null, return 0
- Recursively find the depth of the left subtree
- Recursively find the depth of the right subtree
- Take the larger depth and add 1 for the current node
### Complexity
- Time: O(n)
- Space: O(n)