class Solution {
    public boolean isVowel(char a){
        if(a=='a' || a=='e' || a=='i' || a=='o'|| a=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int max=0;
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                cnt++;
            }
            if(i>=(k-1)){
                max=Math.max(cnt,max);
                if(isVowel(s.charAt(i-(k-1)))){
                    cnt--;
                }
            }
        }
        return max;   
    }
}