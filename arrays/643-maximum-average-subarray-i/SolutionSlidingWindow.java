class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0, j = k - 1;
        int sum  = 0;
        for(int x = 0; x <= j; x++) sum += nums[x];
        int maxSum = sum;
        while(j < nums.length - 1){
            i++; j++;
            sum += nums[j] - nums[i-1];
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }
}