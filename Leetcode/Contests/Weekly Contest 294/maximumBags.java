import java.util.*;
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int size=capacity.length;
        ArrayList<Integer> diff = new ArrayList<Integer>();
        
        for(int k=0;k<size;k++)
        {
            diff.add(capacity[k]-rocks[k]);
        }
        int l=0;
        while(additionalRocks>0)
        {
            int s=0;
            int min=Collections.min(diff);
            for(int i=0;i<diff.size();i++)
            {
                if(diff.get(i)==min)
                {
                    s=i;
                    break;
                }
            }
            if(diff.get(s)<=additionalRocks)
            {
                rocks[s]=capacity[s];
                additionalRocks-=diff.get(s);
                // System.out.println(additionalRocks);
                // System.out.println(rocks[i]);
                diff.set(s,99999);
                l++;
            }
            else{
                diff.set(s,99999);
                l++;
            }
        }
        //System.out.println(size);
        int count=0;
        for(int j=0;j<size;j++)
        {
            if(rocks[j]==capacity[j])
            {
                count++;
            }
        }
        return count;
    }
}