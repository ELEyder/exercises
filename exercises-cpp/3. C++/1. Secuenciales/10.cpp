#include <iostream>
#include <cstdio>
using namespace std;

int main()
{
    system("cls");
    
    int num,x1,x2,x3,x4,final;
    printf("Numero : "); cin>>num;

    x1 = num % 10;
    num = (num - x1)/10;
    x2 = num % 10;
    num = (num - x2)/10;
    x3 = num % 10;
    num = (num - x3)/10;
    x4 = num % 10;
    num = (num - x4)/10;
    
    printf("Suma = %i",x1);
    printf("%i",x2);
    printf("%i",x3);
    printf("%i",x4);
}