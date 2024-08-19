#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    int num;
    int i = 0;
    double cifras[3];
    double num1,num2,num3;

    printf("Número "); cin>>num;

    while (num > 0){
        cifras[i]= num % 10;
        num = num / 10;
        i++;
    }
    num1 = cifras[2];
    num2 = cifras[1];
    num3 = cifras[0];

    if ((num1) - (num2 - 1) + (num3 - 2) == num1) printf("Ascendente");
    else if ((num1) - (num2 + 1) + (num3 + 2) == num1) printf("Descendente");
    else printf("No son consecutivas.");;
    }