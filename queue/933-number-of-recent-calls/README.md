# 933. Number of Recent Calls

## Solution: Sliding Windown
### Idea
- Store recent requests in a queue.
- Add the current request.
- Remove outdated requests from the front of the queue.
- Return the number of remaining requests.
### Complexity
- Time: O(1) amortized
- Space: O(n)