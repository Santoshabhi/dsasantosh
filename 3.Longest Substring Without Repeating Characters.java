class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,m=0;
        boolean [] b = new boolean[256];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            while(b[c]){
                b[s.charAt(l)]=false;
                l++;
            }
            b[c]=true;
            m=Math.max(m,i-l+1);
        }
        return m;
        
    }
}
