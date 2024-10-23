class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int last=s.lastIndexOf(' ');
        int n=s.length();
        return(n-last-1);
    }
}