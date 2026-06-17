class Solution {
    private Stack<Character> build(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '#'){
                if(!st.empty()) st.pop();
            }else{
                st.push(c);
            }
        }
        return st;
    }
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = build(s);
        Stack<Character> st2 = build(t);
        if(st1.size() != st2.size()) return false;
        while(!st1.empty()){
            if(st1.peek() == st2.peek()){
                st1.pop(); st2.pop();
            }else return false;
        }
        return true;
    }
}