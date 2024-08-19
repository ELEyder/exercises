#include <iostream>
using namespace std;

int main() {
    system("cls");

    double altura,radio,area,volumen;

    printf("ALtura (en cm): "); cin>>altura;
    printf("Radio (en cm): "); cin>>radio;

    area = 2 * 3.1416 * radio * (radio + altura);
    volumen = 3.1416 * (radio * radio) * altura;

    printf("Área: %.2f \n",area);
    printf("Volumen:  %.2f \n",volumen);

    return 0;
}