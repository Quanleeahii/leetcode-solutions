# 637. Average of Levels in Binary Tree

# Solution: BFS
## Idea
- Traverse the tree level by level using a Queue 
- For each level, determine its number of nodes by storing q.size() in advance
- Iterate through all nodes of the current level to calculate their sum and add their children to the queue
- Calculate the average of the current level by dividing the sum by the saved size
- Add the average value to the result list
## Complexity
- Time: O(n)
- Space: O(n)