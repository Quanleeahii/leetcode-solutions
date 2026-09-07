# 701. Insert into a Binary Search Tree

## Solution: BST 
### Idea
- If the current node is null, return a new node with the given value
- If the target is smaller than the current value, insert into the left subtree
- If the target is greater than the current value, insert into the right subtree
- Return the current node to maintain tree links
### Complexity
- Time: O(logn) average, O(n) worst-case
- Space: O(logn) average, O(n) worst-case