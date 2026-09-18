# 530. Minimum Absolute Difference in BST

## Solution: Inorder Traversal
### Idea
- Traverse the BST using inorder traversal
- Inorder traversal visits the values in increasing order
- Keep track of the previously visited node
- Calculate the difference between the current node and the previous node
- Update the minimum difference
### Complexity
- Time: O(n)
- Space: O(log n) average, O(n) worst-case