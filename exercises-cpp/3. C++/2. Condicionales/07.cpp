#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    int num1,num2,num3;

    printf("Número 1: "); cin>>num1;
    printf("Número 2: "); cin>>num2;
    printf("Número 3: "); cin>>num3;

    if (num1 > num2 and num1 < num3 or num1 < num2 and num1 > num3){ cout<<"Número intermedio: "<<num1<<endl;}
    else if (num2 > num1 and num2 < num3 or num2 < num1 and num2 > num3) {cout<<"Número intermedio: "<<num2<<endl;}
    else if (num3 > num2 and num3 < num1 or num3 < num2 and num3 > num1) {cout<<"Número intermedio: "<<num3<<endl;}

}