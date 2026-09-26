# 110. Balanced Binary Tree

## Solution 1: Postorder Traversal
### Idea
- Calculate the height of the left and right subtrees
- If their height difference is greater than 1, the tree is not balanced
- Recursively check whether the left and right subtrees are also balanced
### Complexity
- Time: O(n log n) average, O(n²) worst-case
- Space: O(log n) average, O(n) worst-case

## Solution 2: Optimized Postorder Traversal
### Idea
- Use postorder traversal to calculate the height from bottom to top
- Return the subtree height if it is balanced
- Return `-1` if the current subtree is unbalanced
- If a child returns `-1`, propagate `-1` to the parent
- This allows each node to be processed only once
### Complexity
- Time: O(n)
- Space: O(log n) average, O(n) worst-case