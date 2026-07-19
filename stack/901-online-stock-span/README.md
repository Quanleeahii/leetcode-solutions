# 901. Online Stock Span

## Solution: Monotonic StackHistory Tracking
### Idea
- Store pairs of price and span in a monotonic decreasing stack
- Start each new price with a span of 1
- While the current price is greater than or equal to the top price, merge their spans and remove the top element
- Push the merged pair back onto the stack
- The merged span is the answer
### Complexity
- Time: O(1)
- Space: O(n)