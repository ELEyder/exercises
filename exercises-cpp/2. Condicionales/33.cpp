 #include <iostream>
#include <cstdio>
#include <strings.h>
#include <conio.h>
using namespace std;

int main(){
    system("cls");

    int tardanza,rendimi,puntaje,puntaje2,totalPuntos,bono;

    printf("Categoria: ");cin>>tardanza;
    printf("Promedio de Notas: ");cin>>rendimi;

    if (tardanza == 0) puntaje = 10;
    else if (1 <= tardanza <= 2) puntaje = 8;
    else if (3 <= tardanza <= 5) puntaje = 6;
    else if (6 <= tardanza <= 9) puntaje = 4;
    else if (tardanza > 9) puntaje = 0;

    if (rendimi == 0) puntaje2 = 10;
    else if (rendimi == 1) puntaje2 = 8;
    else if (rendimi == 2) puntaje2 = 5;
    else if (rendimi == 3) puntaje2 = 1;
    else if (rendimi > 3) puntaje2 = 0;

    totalPuntos = puntaje + puntaje2;

    if (totalPuntos <= 11) bono = 2.5 * totalPuntos;
    else if (11 <= totalPuntos <= 13) bono = 2.5 * totalPuntos;
    else if (14 <= totalPuntos <= 16) bono = 5 * totalPuntos;
    else if (17 <= totalPuntos <= 19) bono = 7.5 * totalPuntos;
    else if (totalPuntos == 20) bono = 10 * totalPuntos;

    cout<<"Tardanza (Puntos): "<<puntaje<<endl;
    cout<<"Observaciones (Puntos): "<<puntaje2<<endl;
    cout<<"Bonificación: S/. "<<bono<<endl;

}