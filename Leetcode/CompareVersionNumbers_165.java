class Solution {
    public int compareVersion(String version1, String version2) {
        String S1[] = version1.split("\\.");
        for(int i = 0; i < S1.length; i++)
        {System.out.println(S1[i]);}
        String S2[] = version2.split("\\.");
        for(int i = 0; i < S2.length; i++)
        {System.out.println(S2[i]);}
        
        int n = Math.max(S1.length, S2.length);
        for(int i = 0; i < n; i++) {
            int R1 = i < S1.length ? Integer.parseInt(S1[i]) : 0;
            int R2 = i < S2.length ? Integer.parseInt(S2[i]) : 0;
            if(R1 < R2) return -1;
            else if(R1 > R2) return 1;
        }
        return 0;
    }
}