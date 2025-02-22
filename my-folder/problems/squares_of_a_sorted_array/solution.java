class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        int right=n-1;int left=0;int i=n-1; 
        while (left<right){            
            
            System.out.print(result[i]);            
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                result[i]=(nums[left]*nums[left]);
                i--;
                left+=1;
            
            }
            else{
                result[i]=(nums[right]*nums[right]);
                right-=1;
                i--;
            } 
                           
             
        }
        if(left==right && i==0){
                result[0]=nums[right]*nums[right];
            }
        return result;
    }
}