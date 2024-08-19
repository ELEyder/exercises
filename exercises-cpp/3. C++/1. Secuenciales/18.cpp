#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    float unidades,precio,importeCompra,pagar,descuento;

    printf("Unidades: "); cin>>unidades;
    printf("Precio: "); cin>>precio;

    importeCompra = unidades * precio;
    pagar = (importeCompra * 0.85) * 0.85;
    descuento = importeCompra - pagar;


    cout<<"Importe de Compra: "<<importeCompra<<endl;
    cout<<"Descuento: "<<pagar<<endl;
    cout<<"Importe a Pagar: "<<descuento<<endl;

}