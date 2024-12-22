class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] map = new int[128];
        int start=0;int end=0;int max=0;
        while(end<s.length()){
            char c=s.charAt(end);
            map[c]++;
            while(map[c]>1){
                char startChar = s.charAt(start);
                map[startChar]--;
                start++;
            }
            max=Math.max(max,end-start+1);  
            end++;
        }
        return max;
    }
}