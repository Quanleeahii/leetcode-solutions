# 145. Binary Tree Postorder Traversal

# Solution: DFS Postorder Traversal
## Idea
- Traverse the tree using recursion
- Recursively traverse the left subtree
- Recursively traverse the right subtree
- Add the current node's value to the result
- Postorder traversal follows: Left → Right → Root
## Complexity
- Time: O(n)
- Space: O(n)