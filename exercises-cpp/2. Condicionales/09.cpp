#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    int codigoProducto,cantidad,precio,descuento,total;

    printf("Código del Producto: "); cin>>codigoProducto;
    printf("Cantidad: "); cin>>cantidad;

    if (codigoProducto == 101){
        precio = cantidad * 17;}
    else if (codigoProducto == 102){
        precio = cantidad * 25;}
    else if (codigoProducto == 103){
        precio = cantidad * 16;}
    else if (codigoProducto == 104){
        precio = cantidad * 27;}
    
    if (cantidad >= 10){
        descuento = precio * 0.05;}
    else if (cantidad < 10 and cantidad >= 20){
        descuento = precio * 0.08;}
    else if (cantidad < 20 and cantidad >= 30){
        descuento = precio * 0.10;}
    else if (cantidad > 30){
        descuento = precio * 0.13;}

    total= precio - descuento;

    cout<<"Importe de la compra: "<<precio<<endl;
    cout<<"Descuento           : "<<descuento<<endl;
    cout<<"Total a pagar       : "<<total<<endl;
}