class Solution {
    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        if(jug1Capacity+jug2Capacity<targetCapacity){
            return false;
        }
        //check if the target capacity is a multiple of the minimum capacity that can be measured using the jars. To find the minimum capacity, you can use the greatest common divisor (GCD)
        int a=gcd(jug1Capacity, jug2Capacity);
        if(targetCapacity%a==0){
            return true;
        }
        else{
            return false;
        }
    }
    private int gcd(int a , int b){
        if(a==0){
            return b;
        }
        return gcd(b%a, a);
    }
}