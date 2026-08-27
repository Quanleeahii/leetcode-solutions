# 2. Add Two Numbers

## Solution: Two Pointers
### Idea
- Use two pointers to traverse both linked lists
  + Add the current values together with the carry
  + Create a new node for each digit
  + If one list is shorter, simply process the remaining nodes
- Add the final carry if needed
### Complexity
- Time: O(n)
- Space: O(1) 