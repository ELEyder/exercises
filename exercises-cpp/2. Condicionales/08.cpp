#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    int num1,num2,num3,propinaMensual;

    propinaMensual = 20;

    printf("Nota 1: "); cin>>num1;
    printf("Nota 2: "); cin>>num2;
    printf("Nota 3: "); cin>>num3;

    if (num1 > 10) {propinaMensual += 5;}
    if (num2 > 10) {propinaMensual += 5;}
    if (num3 > 10) {propinaMensual += 5;}
    
    cout<<"Propina: "<<propinaMensual<<endl;
}