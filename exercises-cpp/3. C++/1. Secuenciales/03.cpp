#include <iostream>
using namespace std;

int main() {
    system("cls");

    double tramo_1,tramo_2,tramo_3,totalMetros,totalYard;

    printf("Tramo 1 (en Km):"); cin>>tramo_1;
    printf("Tramo 2 (en pies):"); cin>>tramo_2;
    printf("Tramo 3 (en millas):"); cin>>tramo_3;

    tramo_1 *= 1000;
    tramo_2 /= 3.2808;
    tramo_3 /= 16909;
    totalMetros = tramo_1 + tramo_2 + tramo_3;
    totalYard = totalMetros * 1.0936;

    printf("Recorrido Total: \n");
    printf("En metros: %.2f \n",totalMetros);
    printf("En yardas: %.2f \n",totalYard);

    return 0;
}