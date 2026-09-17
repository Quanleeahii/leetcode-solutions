# 98. Validate Binary Search Tree
## Solution: Inorder Traversal
### Idea
- Traverse the tree using inorder traversal
- Keep track of the previously visited node
- The current node's value must be greater than the previous node's value
- If the current value is less than or equal to the previous value, return false
- Update the previous node and continue traversing the right subtree

### Complexity
- Time: O(n)
- Space: O(logn) average, O(n) worst-case