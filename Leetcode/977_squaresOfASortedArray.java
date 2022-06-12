/*
import java.util.*;
class Solution {
    static void sort(int[] arr) {
        if (arr.length < 2) return;

        int mid = arr.length / 2;

        int[] left_half = new int[mid];
        int[] right_half = new int[arr.length - mid];

        // copying the elements of array into left_half
        for (int i = 0; i < mid; i++) {
            left_half[i] = arr[i];
        }
        
        // copying the elements of array into right_half
        for (int i = mid; i < arr.length; i++) {
            right_half[i - mid] = arr[i];
        }

        sort(left_half);
        sort(right_half);
        merge(arr, left_half, right_half);
    }
  
    static void merge(int[] arr, int[] left_half, int[] right_half) {
        int i = 0, j = 0, k = 0;

        while (i < left_half.length && j < right_half.length) {
            if (left_half[i] < right_half[j]) {
                arr[k++] = left_half[i++];
            }
            else {
                arr[k++] = right_half[j++];
            }
        }
        while (i < left_half.length) {
            arr[k++] = left_half[i++];
        }
        while (j < right_half.length) {
            arr[k++] = right_half[j++];
        }
    }
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            
            nums[i]=nums[i]*nums[i];
        }
        sort(nums);
        return nums;
        
        
    }
}
*/



//Efficient Solution 

class Solution {
    public int[] sortedSquares(int[] ar) {
        int n = ar.length;
        int i = 0, j = n-1, k = n-1;
        int[] ans = new int[n];
        while(i!=j)
        {
            if(Math.abs(ar[i])>=Math.abs(ar[j]))
            {
                ans[k--]=ar[i]*ar[i];
                i++;
            }
            else
            {
                ans[k--]=ar[j]*ar[j];
                j--;
            }
        }
        ans[k]=ar[i]*ar[i];
        return ans;
    }
}