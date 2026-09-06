# 515. Find Largest Value in Each Tree Row

## Solution: BFS - Level Order
### Idea
- Use a queue to traverse the tree level by level
- Get the current queue size to determine the number of nodes in each level
- Initialize the maximum value for each level
- Compare each node's value with the current maximum
- Add the maximum value of each level to the result
### Complexity
- Time: O(n)
- Space: O(n)