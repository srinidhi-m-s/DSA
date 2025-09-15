class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Scanner sc=new Scanner(System.in);
       
        String[] arr=text.split(" ");
        int count=0;
        for(String word: arr){
            boolean flag=true;
            for(int i=0;i<word.length();i++){
                for(int j=0;j<brokenLetters.length();j++){
                    if(word.charAt(i) == brokenLetters.charAt(j))
                    {
                        flag = false;
                        break;
                    }
                }                
            }
            if(flag==true) count++;
        }
        return count;
    }
}