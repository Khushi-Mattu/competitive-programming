class GfG{
  /*You are required to complete this method */
   public long multiplyTwoLists(Node l1,Node l2){
          //add code here.
          long num=0;
          long N = 1000000007;
          while(l1!=null){
              num=(num*10)%N+l1.data;
              l1=l1.next;
          }
          long num2=0;
          while(l2!=null){
              num2=(num2*10)%N+l2.data;
              l2=l2.next;
          }
          return (((num)%N)*(num2%N))%N;
   }
}