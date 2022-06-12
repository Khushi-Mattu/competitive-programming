public class Solution{
	public boolean isPalindrome(int x) {
		String str = Integer.toString(x);
        String reverse =  new StringBuilder(str).reverse().toString();
        return  str.equals(reverse)?true:false;}
}
/*----------------------------------------------------------------
Efficient method
public class Solution{
	public boolean isPalindrome(Integer x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int rev = 0;
        while(x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return x == rev || x == rev/10;
}
    
Without String 

public class Solution{
	public boolean isPalindrome(Integer x) {
        Integer reverse=0;
        int temp=x;
        while(x!=0)   {  
            int remainder = x % 10;  
            reverse = reverse * 10 + remainder;  
            x = x/10;  }  
        boolean ans;
        if(temp<0){
            ans=false;
        }
        else{
        if(temp==reverse){
            ans=true;
        }
        else{
            ans=false;
        }
        }
        return ans;
        
}
    
}
*/
