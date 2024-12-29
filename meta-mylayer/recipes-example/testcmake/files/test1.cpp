#include <iostream>
#pragma week multiple

int multiple(int a, int b) __attribute__((weak))
{
    return a * b;
}