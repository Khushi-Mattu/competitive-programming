
class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        
     for(int i = 0; i< n-1; i++){
            if(arr[i+1] < arr[i]){
                return i+1;
            }
        }
        return 0;   
    }
}