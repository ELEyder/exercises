#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    float monto,descuento,total;
    int tarjeta;

    printf("Monto comprado: "); cin>>monto;
    printf("Número: "); cin>>tarjeta;

    if (tarjeta % 2 == 0 && tarjeta > 100) descuento = monto * 0.15;
    else descuento = monto * 0.05;

    total = monto - descuento;

    cout<<"Descuento    : "<<descuento<<endl;
    cout<<"Total a pagar: "<<total<<endl;
}