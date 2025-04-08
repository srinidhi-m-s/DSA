class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        List<Integer> num=new ArrayList<Integer>(10);
        for(int i:nums){
            num.add(i);
        }
        while(!distinct(num)){
            if(num.size()<3){
                
                num.clear();
                count++;
                break;
            }
            num.remove(2);
            num.remove(1);
            num.remove(0);
            count++;
            
        }
        return count;
        
    }
    public boolean distinct(List<Integer> num){
        if(num.size()==1) return true;
        for(int i=0;i<num.size();i++){
            for(int j=i+1;j<num.size();j++){
                if(num.get(i)==num.get(j)){
                    return false;
                }
            }
            
        }
        return true;
    }
    
}