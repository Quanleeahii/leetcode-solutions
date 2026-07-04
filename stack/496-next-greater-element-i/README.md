# 496. Next Greater Element I

## Solution: Monotonic Stack
### Idea
- Use a monotonic decreasing stack
- When a greater element is found:
    + Resolve previous elements
    + Store their next greater value in a hash map
- Elements left in the stack do not have a next greater element
- Build the answer array from the hash map
### Complexity
- Time: O(n)
- Space: O(n)