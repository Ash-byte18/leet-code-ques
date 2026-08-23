class Solution {
    public boolean isPalindromic(String s) {
        String n="",m="";

    
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            int b=(int)a;
            n=Integer.toBinaryString(b);
            while(n.length()<8){
                n='0'+n;
            }
            m=m+n;
            
        }
        int i;
        for(i=0;i<m.length();i++){
            if(m.charAt(i)!=m.charAt(m.length()-1-i)){
                break;
                
            }
        }
        
        return i==m.length();
    }
}