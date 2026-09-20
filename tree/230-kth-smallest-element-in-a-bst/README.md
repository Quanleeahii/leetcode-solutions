# 230. Kth Smallest Element in a BST

## Solution: Inorder Traversal
### Idea
- Traverse the BST using inorder traversal
- Inorder traversal visits the values in increasing order
- Use a counter to track the position of each visited node
- When the counter reaches k, store the current node's value as the result
- Continue the traversal without changing the result
### Complexity
- Time: O(n)
- Space: O(log n) average, O(n) worst-case