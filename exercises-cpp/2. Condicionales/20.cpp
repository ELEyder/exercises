#include <iostream>
#include <cstdio>
using namespace std;

int main(){
    system("cls");

    float num1,num2,num3;

    printf("Numero 1: "); cin>>num1;
    printf("Numero 2: "); cin>>num2;
    printf("Numero 3: "); cin>>num3;
    
    if (num1 == num2 - 1 == num3 - 2) printf("Ascendente");
    else if (num1 == num2 + 1 == num3 + 2) printf("Descendente");
    else printf("Desordenado: ");
    }