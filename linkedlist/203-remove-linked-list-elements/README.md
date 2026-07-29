# 203. Remove Linked List Elements

## Solution: Dummy Node
### Idea
- Create a dummy node pointing to the head of the list
- Use a pointer to traverse the list
- If the next node contains the target value, remove it by skipping the node
- Otherwise, move the pointer forward
- Return the new head
### Complexity
- Time: O(n)
- Space: O(1)