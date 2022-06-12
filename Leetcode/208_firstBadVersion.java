/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int ans=0;
int low = 1 ;
int high = n ;
int mid=0;
if(n==1 ||isBadVersion(1) )
return 1 ;
while(low<=high){
mid = low+(high-low)/2 ;
if(isBadVersion(mid)==true){
if(isBadVersion(mid-1)==false){
ans=mid;
break;}

      else
          high = mid-1;
      
      
    }
      
    else if(isBadVersion(mid) == false)
      low = mid +1 ;
  }
  return ans;
    }
}