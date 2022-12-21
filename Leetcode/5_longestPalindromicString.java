
class Solution {
    static String lcs(String S1, String S2, int m, int n) {
    int[][] LCS_table = new int[m + 1][n + 1];

    // Building the mtrix in bottom-up way
    for (int i = 0; i <= m; i++) {
      for (int j = 0; j <= n; j++) {
        if (i == 0 || j == 0)
          LCS_table[i][j] = 0;
        else if (S1.charAt(i - 1) == S2.charAt(j - 1))
          LCS_table[i][j] = LCS_table[i - 1][j - 1] + 1;
        else
          LCS_table[i][j] = Math.max(LCS_table[i - 1][j], LCS_table[i][j - 1]);
      }
    }

    int index = LCS_table[m][n];
    int temp = index;

    char[] lcs = new char[index + 1];
    lcs[index] = '\0';

    int i = m, j = n;
    while (i > 0 && j > 0) {
      if (S1.charAt(i - 1) == S2.charAt(j - 1)) {
        lcs[index - 1] = S1.charAt(i - 1);

        i--;
        j--;
        index--;
      }

      else if (LCS_table[i - 1][j] > LCS_table[i][j - 1])
        i--;
      else
        j--;
    }
        String str="";

    // Printing the sub sequences
    System.out.print("S1 : " + S1 + "\nS2 : " + S2 + "\nLCS: ");
    for (int k = 0; k <= temp; k++)
      str+=lcs[k];
    System.out.println(str);
    return str;
  }
    public String longestPalindrome(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
       lcs(s,reverse,s.length(),reverse.length());
        return "";
    }
}

/*Time limit exceeded
Brute Force Solution
class Solution {
    public String longestPalindrome(String s) {
        int max=0;
        String fin="";
        if(s.length()==1){
            return s;
        }
        
        for(int i=0;i<s.length();i++){
            for(int j=i;j<=s.length();j++){
                String str=s.substring(i,j); 
                String reverse = new StringBuilder(str).reverse().toString();
                System.out.println(str+" "+reverse);
                if(str.equals(reverse)){
                    if(str.length()>max){
                        max=str.length();
                        fin=str;
                        System.out.println("1");
                    }
                }
            }
        }
        return fin;
    }
}