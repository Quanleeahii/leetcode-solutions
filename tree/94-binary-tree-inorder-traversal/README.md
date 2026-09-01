# 94. Binary Tree Inorder Traversal

# Solution: DFS Inorder Traversal
## Idea
- Traverse the tree using recursion
- Recursively traverse the left subtree
- Add the current node's value to the result
- Recursively traverse the right subtree
- Inorder traversal follows: Left → Root → Right 
## Complexity
- Time: O(n)
- Space: O(n)