#include <stdio.h>
#include <string.h>

int main()
{
    int l;
    int i=0;
    char s[100];
    printf("enter a number:");
    scanf("%s",s);
    int c=0;
    l = strlen(s);
    for(i=0;i<l;i++){
	
        if (s[i]==s[l-i-1])
        {
        c++;
        }
        else
        {
            c--;
        }
    }
    if(c==l){
    	printf("palindrome");
	}
	else{
		printf("not a palindrome");
	}
        return 0;
}
