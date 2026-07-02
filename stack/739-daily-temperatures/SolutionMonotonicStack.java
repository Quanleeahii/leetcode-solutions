class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] nums = new int[temperatures.length];
        st.push(0);
        for(int i = 1; i < temperatures.length; i++){
            while(!st.empty() && temperatures[i] > temperatures[st.peek()]){
                nums[st.peek()] = i - st.peek();
                st.pop();
            }
            st.push(i);
        }
        return nums;
    }
}