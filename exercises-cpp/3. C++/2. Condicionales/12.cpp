#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    int num;

    printf("Número (del 1 al 7): "); cin>>num;

    if (num == 1) printf("Lunes");
    else if (num == 2) printf("Martes");
    else if (num == 3) printf("Miercoles");
    else if (num == 4) printf("Jueves");
    else if (num == 5) printf("Viernes");
    else if (num == 6) printf("Sábado");
    else if (num == 7) printf("Domingo");
}