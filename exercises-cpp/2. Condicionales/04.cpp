#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    double nota1,nota2,nota3,promedio;

    printf("Nota 1: "); cin>>nota1;
    printf("Nota 1: "); cin>>nota2;
    printf("Nota 1: "); cin>>nota3;

    if (nota3 < 10){
        nota3 += 2;
    }
    promedio = (nota1 + nota2 + nota3) / 3;
    cout<<"Promedio: "<<promedio<<endl;
}