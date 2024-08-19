#include <iostream>
#include <cstdio>
using namespace std;

int main()
{
    system("cls");
    
    int numero;
    printf("Numero : "); cin>>numero;
    
    int c1 = (int) (numero / 1000); numero %= 1000;
    int c2 = (int) (numero / 100); numero %= 100;
    int c3 = (int) (numero / 10);
    int c4 = (int) (numero % 10);

    int suma = c1 + c2 + c3 + c4;

    printf("Suma = %i", suma);