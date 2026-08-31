class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder a=new StringBuilder();
        for(int i=0;i<words.length;i++){
            StringBuilder sb = new StringBuilder  (words[i]);
            sb.reverse();
            a.append(sb);
            if(i!=words.length-1){
                a.append(" ");
            }
        }
            return a.toString();
        
            
    }
}