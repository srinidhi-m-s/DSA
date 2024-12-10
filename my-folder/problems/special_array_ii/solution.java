class Solution {
    public static boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] violations = new int[n - 1];
        
        for (int i = 0; i < n - 1; i++) {
            if ((nums[i] + nums[i + 1]) % 2 == 0) {
                violations[i] = 1;
            }
        }

        int[] prefixSum = new int[n];
        for (int i = 0; i < n - 1; i++) {
            prefixSum[i + 1] = prefixSum[i] + violations[i];
        }

        boolean[] ans = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int from = queries[i][0];
            int to = queries[i][1];
            
           
            if (prefixSum[to] - prefixSum[from] == 0) {
                ans[i] = true;
            } else {
                ans[i] = false;
            }
        }

        return ans;
    }
}
