# 011. Container With Most Water

## Solution: Two Pointers
### Idea
- Use two pointers at both ends of the array
- Calculate the area formed by the two lines
- Move the pointer pointing to the shorter line inward
- Update the maximum area during traversal
- Repeat until the two pointers meet
### Why move the shorter line?
- Moving the taller line only decrease the width while the height cannot increase
- Therefore, the area cannot become larger
- Only moving the shorter line give a chance to find a large area
### Complexity
- Time: O(n)
- Space: O(1)