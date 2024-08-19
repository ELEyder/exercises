#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    int num;

    printf("Número: "); cin>>num;

    if (num > 0){
        printf("Es positivo");}
    else if (num < 0){
        printf("Es negativo");}
    else{
        printf("Es cero.");}
}