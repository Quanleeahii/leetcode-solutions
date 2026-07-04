class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] arr = new int[nums1.length];
        for(int x : nums2){
            while(!st.empty() && x > st.peek()) mp.put(st.pop(), x);
            st.push(x);
        }
        while(!st.empty()) mp.put(st.pop(), -1);
        for(int i = 0; i < nums1.length; i++) arr[i] = mp.get(nums1[i]);
        return arr;
    }
}