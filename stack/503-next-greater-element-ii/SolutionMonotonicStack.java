class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] result = new int[nums.length];
        for(int i = 0; i < 2*nums.length; i++){
            int index = i % nums.length;
            while(!st.empty() && nums[index] > nums[st.peek()])
                result[st.pop()] = nums[index];
            if(i < nums.length) st.push(i);
        }
        while(!st.empty()) result[st.pop()] = - 1;
        return result;
    }
}