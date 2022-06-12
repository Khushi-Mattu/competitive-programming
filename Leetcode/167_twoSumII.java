class Solution {
public int[] twoSum(int[] numbers, int target) {
	 //we take 2 pointers
    //one from the left and one from the right
    int start =0;
    int end = numbers.length-1;

    while(start < numbers.length && end > 0)
    {
        
        if( numbers[start] + numbers[end] == target  ) 
        {
            return new int[] {start+1,end+1};
        }
        if( (numbers[start] + numbers[end] ) > target ) // if your combined sum is too large
        {                              // then move your right pivot to the left(left+ right > sum, then decrease it)
            end--;
        }
        else{                           // other wise if ( left + right < sum, increase your left pivot value)
            start++;
        }
    }
    return new int[] {0,0};
}
}