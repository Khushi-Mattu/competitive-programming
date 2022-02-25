/*
A big hall’s floor is filled linearlly with ‘n’ rectangular cardboards of same size ‘s’. Each cardboard is given an index ‘i’ indicating the position of it on the floor. The value of ‘i’ ranges from 1 to ‘n’. And some integer ‘p’ is written on each cardboard. n-1 values written on the cardboard are continuous integers starting from some number ‘m’ and one of the value is repeated.
A monkey enters the hall and sits on the first cardboard and then it finds the difference ‘d’ between the numbers written on the carboard on which it is sitting and the adjacent cardboard on the right side. Then it jumps to the ‘dth’ carboard. It continues this either till the difference ‘d’ is zero or when it sits on the same cardboard which it has previously sat. If ‘d’ is zero then the monkey is happy and when the monkey has to sit on the cardboard on which it sat already it gets angry. In both the cases the monkey quits the hall.
Given n integers written on the cardboards arranged in the order from 1 to n, write a C program to print the numbers written on the cardboards on which the monkey sits. Also print either Happy or Angry based on the condition the monkey quits.
For example, given eight integers written on the cardboard as 34, 39, 33, 37, 37, 35, 38, 36 your program should print 34, 37, 39, 35, 33, and 37 and also print Happy. If six integers are written in the cardboard as 34, 36, 35, 35, 38, 37 then the monkey will sit on cardboard with numbers 34, 36, 34 sees that it has sat on the cardboard which it had sat already so gets angry. So print 34, 36, 34 and Angry.

Boundary Condition
n<20

Input Format
First line contains the number of cardboards, n
Next line contains ‘n’ numbers written on the cardboard separated by a space

Output Format
Print the numbers on the cardboard that the monkey sits in sequence separated by a space. Print Happy or Angry based on the quit condition of monkey
*/
//package problems;
import java.util.*;
class Main{
public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
  int num=sc.nextInt();
  List<Integer> l = new ArrayList<Integer>();
  List<Integer> c = new ArrayList<Integer>();
  for(int i=0;i<num;i++){
      l.add(sc.nextInt());
  }
  List<Integer> visited = new ArrayList<Integer>();
  visited.add(l.get(0));
  int i=0;
  int d=0;
  int j;
  //int flag=0;
  while(true){
  j=i+1;
  d=Math.abs(l.get(j)-l.get(i));
  if(d==0 || c.contains(d-1)){
      break;
  }
  else{
      c.add(d-1);
  }
  visited.add(l.get(d-1));
  i=d-1;
  }
  for(int k=0;k<visited.size();k++){
      System.out.print(visited.get(k)+" ");
  }
  System.out.println();
if(d==0){
  System.out.println("Happy");
}
else{
  visited.add(l.get(d-1));
  System.out.println("Angry");
}
  
  sc.close();
}
}
