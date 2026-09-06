# 199. Binary Tree Right Side View

## Solution: BFS - Level Order
### Idea
- Use a queue to traverse the tree level by level
- Get the current queue size to determine the number of nodes in each level
- Process all nodes in the current level
- Add the left and right children to the queue
- Add the last node of each level to the result
### Complexity
- Time: O(n)
- Space: O(n)