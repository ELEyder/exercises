#include <iostream>
using namespace std;

int main() {
    system("cls");

    double alturaPies,alturaPul,alturaPiesMetros,alturaPulMetros,alturaTotal;

    printf("Estatura (En pies): "); cin>>alturaPies;
    printf("Estatura faltante (En pulgadas): "); cin>>alturaPul;

    alturaPiesMetros = alturaPies * 0.30480;
    alturaPulMetros = alturaPul * 0.0254;
    alturaTotal = alturaPiesMetros + alturaPulMetros;

    printf("Altura total (en metros): %.2f \n",alturaTotal);

    return 0;
}