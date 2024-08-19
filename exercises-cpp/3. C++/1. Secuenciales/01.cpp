#include <iostream>
using namespace std;

int main() {
    system("cls");
    int varones, mujeres;

    printf("varones : "); cin>>varones;
    printf("mujeres : "); cin>>mujeres;

    int total = varones + mujeres;
    double pvarones = varones * 100.0 / total;
    double pmujeres = mujeres * 100.0 / total;

    printf("% varones = %.2f %%\n",pvarones);
    printf("% mujeres = %.2f %%\n",pmujeres);

    return 0;
}