import java.io.*;
import java.util.*;
import java.util.Collections;
class Solution {
   Vector<Integer> sequentialDigits(int low, int high) {
        Vector<Integer> ans=new Vector<Integer>();
        for(int i=1;i<10;i++){
            int no = i;
            for(int j=i+1;j<10;j++){
                no = no *10 + j; // a, a + d, a + 2d where d = 1
                if(no >= low && no <= high){
                    ans.add(no);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}