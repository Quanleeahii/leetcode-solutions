# 102. Binary Tree Level Order Traversal

## Solution: BFS
### Idea
- Use a queue to traverse the tree level by level
- Add the root node to the queue
- Get the current queue size to determine the number of nodes in the current level
- Process all nodes in the current level
- Add the left and right children to the queue
- Store each level in the result
### Complexity
- Time: O(n)
- Space: O(n)