

//Time Limit Exceeded
//Brute Force technique
/*
class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        int weak=0;
        ArrayList <Integer> visited=new ArrayList<Integer>();
        for(int i=0;i<properties.length;i++){
            for(int j=i+1;j<properties.length;j++){
                if((properties[i][0]<properties[j][0] && properties[i][1]<properties[j][1])){
                    if(!visited.contains(i)){
                    weak++;
                    visited.add(i);
                    }
                }
                else if((properties[i][0]>properties[j][0] && properties[i][1]>properties[j][1])){
                    if(!visited.contains(j) ){
                    weak++;
                    visited.add(j);
                    }
                    
                }
            }
        }
        return weak;
    }
}
*/

//Efficient Solution 

class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        
        // if we sort only by 1st indexes, there could be values where 1st index is the same 
        // Arrays.sort(properties, (a,b) -> Integer.compare(a[0], b[0]));
        
        // b[1], a[1] because we need the 2nd values in descending order
        Arrays.sort(properties, (a,b) -> (a[0] == b[0]) ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0]));
        
        int noOfWeakCharacters = 0;
        int len = properties.length;
       // improvization here - // we need to keep track of the max value
        int max = properties[len-1][1];
        
        for(int i = len-2; i>=0 ;i--) {
            
            if(properties[i][1] < max) {
                noOfWeakCharacters++;
            } else {
                max = properties[i][1];
            }
        }
        return noOfWeakCharacters;
    }
}