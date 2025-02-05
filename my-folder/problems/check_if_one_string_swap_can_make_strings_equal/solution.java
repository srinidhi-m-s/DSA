class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        int count=0;boolean ans=false;char temp;char temp1=' ';char temp2=' ';
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                temp=s1.charAt(i);System.out.println(temp);
                count++;if(count>2) return false;
                if((temp==temp2) && (temp1==s2.charAt(i))) ans=true;
                System.out.println("temp:"+temp+" temp2:"+temp2);
                temp2=s2.charAt(i);
                temp1=temp;
                

            }
            
        }
        
        return ans;
    }
}