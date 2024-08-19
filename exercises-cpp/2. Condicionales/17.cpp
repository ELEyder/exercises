#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    float precio,cantidad,compra,descuento,lapicero,total,ingreso2;

    printf("Precio del producto: "); cin>>precio;
    printf("Cantidad comprada: "); cin>>cantidad;
    compra = precio * cantidad;

    if (cantidad < 72) descuento = 0.15;
    else descuento = 0.10;
    if (cantidad >= 360) lapicero = (cantidad / 36) * 2;
    else lapicero = 0;
    total = compra * descuento;

    cout<<"Monto de la Compra   : "<<compra<<endl;
    cout<<"Descuento            : "<<descuento<<endl;
    cout<<"Total a Pagar        : "<<total<<endl;
    cout<<"Lapiceros Obsequiados: "<<lapicero<<endl;
}