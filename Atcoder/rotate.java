package problems;
import java.util.Scanner;
public class rotate {
	public static int arrayToInt(int[] arr)
	{
	    int result = 0;
	    for (int n = arr.length - 1, i = 1; n >= 0; n --, i *= 10) 
	    {
	         result += Math.abs(arr[n]) * i;
	    }
	    if (arr[0] < 0) 
	    {
	        result = - result;
	    }
	    return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		String temp = Integer.toString(number);
		int[] numbers = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
		    numbers[i] = temp.charAt(i) - '0';
		}
		int[] numbers2 = new int[temp.length()];
		int[] numbers3 = new int[temp.length()];
		
        for (int i = 2; i >=0; i--) {
        	 if(i==0) {
             	numbers2[i]=numbers[2];
             	break;
             }
        	 else {
            numbers2[i] = numbers[i-1];
        	 }
           
        }
        for (int i = 2; i >=0; i--) {
        	if(i==0) {
            	numbers3[i]=numbers2[2];
            	break;
            }
        	else {
            numbers3[i] = numbers2[i-1];
        	}
        }
		 int num1=arrayToInt(numbers);
         int num2=arrayToInt(numbers2);
         int num3=arrayToInt(numbers3);
         System.out.println(num1+num2+num3);	 
	}
}
