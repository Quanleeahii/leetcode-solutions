class Solution {
    private boolean isVowels(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public int maxVowels(String s, int k) {
        int i = 0, j = k - 1;
        char[] arr = s.toCharArray();
        int sum = 0;
        for(int x = 0; x <= j; x++){
            char c = arr[x];
            if(isVowels(c)) sum += 1;
        }
        int maxSum = sum;
        while(j < arr.length - 1){
            i++; j++;
            char c1 = arr[i-1], c2 = arr[j];
            if(isVowels(c2)) sum++;
            if(isVowels(c1)) sum--;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}