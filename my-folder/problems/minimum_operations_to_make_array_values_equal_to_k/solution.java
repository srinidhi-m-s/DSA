class Solution {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> num=new HashSet<>();
        for(int i:nums){
            if(i<k) return -1;
            if(i==k) continue;
            if(num.add(i)) num.add(i);
        }
        return num.size();
    }
}