# 503. Next Greater Element II

## Solution: Monotonic Stack
### Idea
Use a monotonic decreasing stack to store indices whose next greater element has not been found.
- Traverse the array twice to simulate a circular array.
- During the second traversal:
  + Do not push new indices into the stack.
  + Only help the remaining indices in the stack find their next greater element.
- Indices still left in the stack after two traversals have no greater element.
### Complexity
- Time: O(n)
- Space: O(n)