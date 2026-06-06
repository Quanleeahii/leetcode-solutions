class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] res = s.toCharArray();
        char[] num = t.toCharArray();
        Arrays.sort(res); Arrays.sort(num);
        for(int i = 0; i < res.length; i++){
            if(res[i] != num[i]) return false;
        }
        return true;
    }
}