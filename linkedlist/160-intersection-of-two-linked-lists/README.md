# 160. Intersection of Two Linked Lists

# Solution: Two Pointers
# Idea
- Use two pointers for linked list A and B
- When a pointer reaches null, switch it to the head of other list
- Both pointers travel the same total distance and meet at the intersection node
# Complexity
- Time: O(n)
- Space: O(1)