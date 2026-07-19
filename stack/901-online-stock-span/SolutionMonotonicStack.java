class Pair{
    int price;
    int span;
    Pair(int price, int span){
        this.price = price;
        this.span = span;
    }
}
class StockSpanner {
    private Stack<Pair> st;
    public StockSpanner() {
        st = new Stack<>();
    }
    public int next(int price) {
        Pair p = new Pair(price, 1);
        while(!st.empty() && price >= st.peek().price){
            p.span += st.peek().span;
            st.pop();
        }
        st.push(p);
        return p.span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */