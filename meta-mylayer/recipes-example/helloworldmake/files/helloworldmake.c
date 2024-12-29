#include <stdio.h>

unsigned int in_value=0;
extern void print_out(unsigned int in_val);
int main()
{
    printf("Input a value (from helloworldmake)\n");
    scanf("%d", &in_value);
    print_out(in_value);
    return 0;
}