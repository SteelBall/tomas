#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("Hello world %d!!\n", 0/8);

    int i = 0;
    for(i=1;i<10;i++) {
        printf("i = %d", i);
    }
    return 0;
}