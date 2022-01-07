#include<stdio.h>
#include<math.h>



int  main()

{
    int a,b,c,s,t;
    int area;

    printf("Enter side 1 length:");
    scanf("%d",&a);
    printf("Enter side 2 length:");
    scanf("%d",&b);
    printf("Enter side 3 length:");
    scanf("%d",&c);
    t=(a+b+c);
    s=t/3;
    area=pow((t*(t-a)*(t-b)*(t-c)),0.5);

    if(a+b>c)
    {

        printf("The triangle is possible and the area is %ld",area);
    }
    else if(b+c>a)
    {

         printf("The triangle is possible and the area is %ld", area);
    }
   else if(c+a>b)
   {

        printf("The triangle is possible and the area is %ld", area);
   }
   else
   printf("The triangle is not possible.");

   return 0;

}
