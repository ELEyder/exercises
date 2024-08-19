#include <iostream>
using namespace std;

int main() {
    system("cls");

    double base,altura,area,perimetro;

    printf("Base (en cm): "); cin>>base;
    printf("Altura (en cm): "); cin>>altura;

    area = base * altura;
    perimetro = 2 * (base + altura);

    printf("Área: %.2f \n",area);
    printf("Perímetro: %.2f \n",perimetro);

    return 0;
}