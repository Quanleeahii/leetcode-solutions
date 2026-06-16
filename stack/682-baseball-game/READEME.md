# 682. Baseball Game

## Solution: History Tracking
### Idea
- Use a stack to store valid scores
+ "C": remove the previous score
+ "D": add double the previous score
+ "+": add the sum of the previous two scores
- Normal number: push into the stack
### Complexity
- Time: O(n)
- Space: O(n)