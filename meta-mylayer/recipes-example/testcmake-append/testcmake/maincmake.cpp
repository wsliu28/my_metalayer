#include <iostream>

extern int multiple(int a, int b);

int add(int a, int b)
{
    return a+b;
}

int main()
{
    int temp = add(3, 4);
    int temp1 = multiple(6, 9);
    std::cout << "The result of adding 3 and 4 is " << temp << std::endl;
    std::cout << "and the multiplication result of 6*9 is " << temp1 << std::endl;
    return 0;
}
