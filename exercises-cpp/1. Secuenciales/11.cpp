#include <iostream>
#include <cstdio>
#include <cstring>
using namespace std;

int main()
{
    system("cls");
    
    char num1[4];
    char num2[4];
    printf("Numero 1: ");cin>>num1;
    printf("Numero 2: ");cin>>num2;

    cout << "Nuevo 1: "<< num2[2] << num1[1] << num2[0] << endl;
    cout << "Nuevo 2: "<< num1[2] << num2[1] << num1[0] << endl;
}