# 622. Design Circular Queue

## Solution: Circular Array
### Idea
- Store elements in a fixed-size array
- Use two pointers front and rear to represent the first and last elements
- When either pointer reaches the end of the array, wrap it back to the beginning
- Handle the special cases when the queue becomes empty or full
### Complexity
- Time: O(1)
- Space: O(n)