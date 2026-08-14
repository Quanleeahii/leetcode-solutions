# 19. Remove Nth Node From End of List

## Solution: Two Pointers
### Idea
- Use two pointers with a fixed gap of n
- Move both pointers until the fast pointer reaches the end
- The slow pointer will be at the node before the target node
- Use a dummy node to handle removing the head
### Complexity
- Time: O(n)
- Space: O(1)