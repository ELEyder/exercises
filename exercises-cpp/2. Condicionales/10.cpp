#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    int nota1,nota2,nota3,nota4,nota5,mayor,menor;

    printf("Nota 1: "); cin>>nota1;
    printf("Nota 2: "); cin>>nota2;
    printf("Nota 3: "); cin>>nota3;
    printf("Nota 4: "); cin>>nota4;
    printf("Nota 5: "); cin>>nota5;

    if (nota1 > nota2 and nota1 > nota3 and nota1 > nota4 and nota1 > nota5) {mayor = nota1;}
    else if (nota2 > nota1 and nota2 > nota3 and nota2 > nota4 and nota2 > nota5) {mayor = nota2;}
    else if (nota3 > nota1 and nota3 > nota2 and nota3 > nota4 and nota3 > nota5) {mayor = nota3;}
    else if (nota4 > nota1 and nota4 > nota2 and nota4 > nota3 and nota4 > nota5) {mayor = nota4;}
    else if (nota5 > nota1 and nota5 > nota2 and nota5 > nota3 and nota5 > nota4) {mayor = nota5;}

    if (nota1 < nota2 and nota1 < nota3 and nota1 < nota4 and nota1 < nota5) {menor = nota1;}
    else if (nota2 < nota1 and nota2 < nota3 and nota2 < nota4 and nota2 < nota5) {menor = nota2;}
    else if (nota3 < nota1 and nota3 < nota2 and nota3 < nota4 and nota3 < nota5) {menor = nota3;}
    else if (nota4 < nota1 and nota4 < nota2 and nota4 < nota3 and nota4 < nota5) {menor = nota4;}
    else if (nota5 < nota1 and nota5 < nota2 and nota5 < nota3 and nota5 < nota4) {menor = nota5;}

    cout<<"Mayor: "<<mayor<<endl;
    cout<<"Menor: "<<menor<<endl;
}