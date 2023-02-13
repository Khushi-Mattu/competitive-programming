class Solution {
  public int countOdds(int low, int high) {
    // If low is even, make it odd.
    if ((low & 1) == 0) {
      low++;
    }

    // low could become greater than high due to incrementation
    // if it is, the answer is 0; otherwise, use the formula.
    return low > high ? 0 : (high - low) / 2 + 1;
  }
}


/*
class Solution {
    public int countOdds(int low, int high) {
        int sum=0;
        if(low%2==0){
        for(int i=low+1;i<=high;i+=2){
        
                sum++;
        
        }
        }
        else{
            for(int i=low;i<=high;i+=2){
            
                sum++;
            
        }
        }
        return sum;
    }
}