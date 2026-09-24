# 938. Range Sum of BST

## Solution: BST Search
### Idea
- Use the BST property to skip unnecessary subtrees
- If the current value is smaller than `low`, search only the right subtree
- If the current value is greater than `high`, search only the left subtree
- If the current value is within the range, add it to the results from both subtrees
### Complexity
- Time: O(n)
- Space: O(log n) average, O(n) worst-case