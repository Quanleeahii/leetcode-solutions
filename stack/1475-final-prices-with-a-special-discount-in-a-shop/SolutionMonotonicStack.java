class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int[] answer = new int[prices.length];
        st.push(0);
        for(int i = 1; i < prices.length; i++){
            while(!st.empty() && prices[i] <= prices[st.peek()])
                answer[st.peek()] = prices[st.pop()] - prices[i];
            st.push(i);
        }
        while(!st.empty()) answer[st.peek()] = prices[st.pop()];
        return answer;
    }
}