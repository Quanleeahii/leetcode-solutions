class Solution {
    public int area(int[] height, int i, int j){
        return Math.min(height[i], height[j]) * (j - i);
    }
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int S = area(height, 0, height.length - 1);
        while(i < j){
            S = Math.max(S, area(height, i, j));
            if(height[i] < height[j]) i++;
            else j--;
        }
        return S;
    }
}