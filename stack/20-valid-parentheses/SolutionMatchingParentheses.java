class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '['){
                st.push(c);
            }else{
                if(st.empty()) return false;
                char top = st.pop();
                if (top == '(' && c != ')') return false;
                else if (top == '[' && c != ']') return false;
                else if (top == '{' && c != '}') return false;
            }
        }
        return st.empty();
    }
}