# 20. Valid Parentheses

## Solution: Matching Parentheses
### Idea
- Push opening brackets into the stack
- When meeting a closing bracket:
+ If the stack is empty, return false
+ Pop the opening bracket in the top of stack
+ Check whether the pair matches
+ If not match, return false
- After processing all characters, the string is valid if and only if the stack is empty
### Complexity
- Time: O(n)
- Space: O(n)