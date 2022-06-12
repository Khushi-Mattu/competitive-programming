class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        int front_pointer = 0;
        int rear_pointer = arr.length - 1;
        while(front_pointer + 1 < arr.length - 1 && arr[front_pointer] < arr[front_pointer + 1]) front_pointer++;
        //f+1<arr.length-1 because we are checking with next number which should be inside bounds
        while(rear_pointer - 1 > 0 && arr[rear_pointer] < arr[rear_pointer - 1]) rear_pointer--;
        //r-1 should be greater than 0 because index should be greater than or equal to 0
        return front_pointer == rear_pointer;
    }
}

//[0,2,3,4,5,2,1,0]
//front pointer=f , rear pointer=r
// f=0 
//1<7 and 0<2 f=1
//2<7 and 2<3 f=2
//3<7 and 3<4 f=3
//4<7 and 4<5 f=4
//5<7 but 5 not less than 2 so f=4
//r=7
// 6>0 and 0<1 r=6
// 5>0 and 1<2 r=5
//4> and  2<5 r=4
// r=4


