#include <iostream>
using namespace std;

int main() {
    system("cls");

    double altura,radio,aBase,aLateral,aTotal;

    printf("ALtura (en cm): "); cin>>altura;
    printf("Radio (en cm): "); cin>>radio;

    aBase = 3.1416 * (radio * radio);
    aLateral = 2 * 3.1416 * radio * altura;
    aTotal = 2 * aBase + aLateral;

    printf("Área de la Base: %.2f \n",aBase);
    printf("Área de Lateral: %.2f \n",aLateral);
    printf("Área Total: %.2f \n",aTotal);

    return 0;
}