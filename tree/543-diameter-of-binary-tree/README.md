# 543. Diameter of Binary Tree

## Solution: Postorder DFS
### Idea
- Use postorder DFS to calculate the height of each subtree
- Get the height of the left and right subtrees
- The diameter passing through the current node is `left + right`
- Keep track of the maximum diameter found
- Return `1 + max(left, right)` as the height of the current subtree
### Complexity
- Time: O(n)
- Space: O(log n) average, O(n) worst-case