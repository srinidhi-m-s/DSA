class Solution {
    public boolean searchMatrix(int[][] matrix, int target){
        int m=matrix.length;
        int n=matrix[0].length;
        
        for(int i=0;i<m;i++){
            if(matrix[i][0]>target) m=i;
        }
        for(int i=0;i<n;i++){
            if(matrix[0][i]>target) n=i;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==target) return true;
            }            
        }
        return false;
    }
}