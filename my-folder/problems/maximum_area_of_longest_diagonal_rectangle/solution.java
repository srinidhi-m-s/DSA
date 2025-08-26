class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max=0;int ind=0;
        for(int i=0;i<dimensions.length;i++){
            double dia=Math.sqrt((dimensions[i][0]*dimensions[i][0])+(dimensions[i][1]*dimensions[i][1]));
            if(dia>max){
                max=dia;
                ind=i;
            }
            else if(dia==max){
                if(Math.max(dimensions[ind][0]*dimensions[ind][1],dimensions[i][0]*dimensions[i][1])==dimensions[i][0]*dimensions[i][1])
                ind=i;
            }
        }
        return (dimensions[ind][0]*dimensions[ind][1]);

    }
}