class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int[] freq =new int[n-1];
        for(int i:nums){
            freq[i-1]+=1;
        }
        for(int j=0;j<n-1;j++){
            if(freq[j]>1) return j+1;
        }
        return 0;
    }
}