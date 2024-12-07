class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;
            
            // Check if the complement is present in the hashmap
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Add the number and its index to the hashmap
            map.put(num, i);
        }
        return new int[0];
        
    }
    
}