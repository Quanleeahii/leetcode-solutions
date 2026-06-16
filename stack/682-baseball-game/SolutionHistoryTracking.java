class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("C")){
                sum -= st.pop();
            }else if(operations[i].equals("D")){
                int x = 2 * st.peek();
                st.push(x);
                sum += x;
            }else if(operations[i].equals("+")){
                int top = st.pop();
                int plusScore = top + st.peek();
                st.push(top);
                st.push(plusScore);
                sum += plusScore;
            }else{
                int x = Integer.parseInt(operations[i]);
                st.push(x);
                sum += x;
            }
        }
        return sum;
    }
}