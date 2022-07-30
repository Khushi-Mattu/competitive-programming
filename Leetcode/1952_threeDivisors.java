class Solution {
    public boolean isThree(int n) {
        int cnt=0;
        boolean bool=true;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        if(cnt==3){
            bool=true;
        }
        else{
            bool= false;
        }
        return bool;
    }
}