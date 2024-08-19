#include <iostream>
using namespace std;

int main() {
    system("cls");

    double cant;

    printf("Cantidad (En metros):"); cin>>cant;

    double cm = cant * 100;
    double pul = cm / 2.54;
    double pies = pul / 12;
    double yard = pies / 3;

    printf("La equivalencia en: \n");
    printf("Centímetros: %.2f \n",cm);
    printf("Pulgadas: %.2f \n",pul);
    printf("Pies: %.2f \n",pies);
    printf("Yardas: %.2f \n",yard);

    return 0;
}