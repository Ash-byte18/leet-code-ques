class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
    if(s.length()<p.length())
    return ans ;

    int [] pfreq = new int[26];
    int [] wfreq = new int[26];
    for(int i=0;i<p.length();i++){
    pfreq[p.charAt(i)-'a']++;
    }
    int k =p.length();

    for (int i=0;i<k;i++){
        wfreq[s.charAt(i) - 'a']++;}
        if(Arrays.equals(pfreq,wfreq)){
            ans.add(0);

        }
        for (int i = k; i < s.length(); i++) {
            wfreq[s.charAt(i) - 'a']++;
            wfreq[s.charAt(i - k) - 'a']--;
            if (Arrays.equals(pfreq, wfreq)) {
                ans.add(i - k + 1);
            }
        }
        return ans;
    }
}