class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> freq1 = new HashMap<>();
        for(char s1 : s.toCharArray()){
            if(freq1.containsKey(s1)){
                freq1.put(s1, freq1.get(s1) + 1);
            }else{
                freq1.put(s1, 1);
            }
        }
        char[] arr = t.toCharArray();
        for(char c : arr){
            if(freq1.containsKey(c)){
                freq1.put(c, freq1.get(c) - 1);
                if(freq1.get(c) < 0) return false;
            }else return false;
        }
        return true;
    }
}