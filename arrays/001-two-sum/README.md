# 1. Two Sum

## Pattern
Array

## Solution 1: Brute Force
### Idea
Duyệt mọi cặp phần tử bằng 2 vòng for.
Nếu nums[i] + nums[j] == target thì return về {i, j}.
### Complexity
Time: O(n^2)
Space: O(1)
### Notes:
- Khi n lớn sẽ chậm
- Có thể tối ưu bằng HashMap xuống O(n)

## Solution 2: Hash Map