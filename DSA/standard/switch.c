#include <stdio.h>
#include <string.h>

int main(void)
{
    char a,b,c,f;
    char D;
    printf("Enter your choice from a,b and c:");
    scanf("%c", &D);
    switch(D)
    {
        case'a':  int i,length;
                  int f=0;
                  char letter[100];
                  printf("enter the word: \n");
                  scanf("%s", letter);
                  length = strlen(letter);
                  for(i = 0;i<length;i++)
                  {
                        if(letter[i]==letter[length-1-i])
                        {
                             f++;
                        }
                        else
                        f=0;
                  }
                  if(f==length)
                  printf("this is a palindrome\n");
                  else
                  printf("this letter is not a palindrome\n");

                  return 0;
                  break;

        case 'b':  int index = 1;
                   int add = 1;
                   int n;
                   printf("Enter the number of tearms: ");
                   scanf("%d", &n);
                   while(index<=3)
                   {
                        add+=index;
                        index ++;
                   }
                   printf("The Fibonacci series sum is: %d", add);
                   return 0;
                   break;

        case'c':    int A = 101;
                    int d = 0;
                    int sum = 0;
                    for(A=101;A<200;A++)
                    {
                          if(A%3==0 && A%5==0)
                          {
                               sum+=A;
                               d++;
                          }
                          else
                          d+=0;
                    }

                    printf("the number of terms and the total sum is:\n %i,%i ", d,sum);
                    return 0;
                    break;
    }
        return 0:
}

