#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    float angulo,importe,descuento,total,caramelos;

    printf("Angulo: "); cin>>angulo;

    if (angulo < 90){
        printf("Ángulo Agudo.");
        }
    else if (angulo == 90){
        printf("Ángulo Recto.");
        }
    else if (angulo > 90 and angulo < 180){
        printf("Ángulo Obtuso.");
    }
    else if (angulo == 180){
        printf("Ángulo Llano.");
    }
    else if (angulo > 180 and angulo < 360){
        printf("Ángulo Cóncavo.");
    }
    else if (angulo == 360){
        printf("Ángulo Completo.");
    }
    else{
        printf("Fuera de Rango");
    }
}