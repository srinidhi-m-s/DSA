class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean flag;int n=mat.length;
        for(int k=0;k<4;k++){
            
            
            flag=true;            
            for(int i=0;i<n;i++){
                
                for(int j=0;j<n;j++){
                    if(mat[i][j]!=target[i][j]) flag=false;
                }
            }   
            if(flag) return true;
            rotate(mat);
        }
        return false;
    }
    public void rotate(int[][] matrix) {
        int n=matrix.length;int temp;
        for(int i=0;i<n/2;i++){
            for(int j=i;j<n-1-i;j++){                
                temp=matrix[i][j];  
                matrix[i][j]=matrix[n-j-1][i];
                matrix[n-j-1][i]=matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1]=matrix[j][n-1-i];
                matrix[j][n-1-i]=temp;
            }
        }
        
    }
}