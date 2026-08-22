# 328. Odd Even Linked List

# Solution: Two Pointers
# Idea
- Use two pointers to build separate odd-indexed and even-indexed chains
- Rearrange the `next` pointers while keeping the original order in each chain
- Connect the odd chain to the head of the even chain at the end
# Complexity
- Time: O(n)
- Space: O(1)