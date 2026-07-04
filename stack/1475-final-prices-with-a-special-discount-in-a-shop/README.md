# 1475. Final Prices With a Special Discount in a Shop

## Solution: Monotonic Stack
### Idea
- Store indices in a stack
- Maintain the stack in increasing order of prices
- When a smaller or equal price is found:
    + Apply the discount
    + Remove previous prices from the stack
- Prices left in the stack do not receive any discount
### Complexity
- Time: O(n)
- Space: O(n)