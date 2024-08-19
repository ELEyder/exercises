#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    float unidades,importe,descuento,total,caramelos;

    printf("Cantidad a comprar: "); cin>>unidades;

    importe = unidades * 20;

    if (importe > 0 and importe <= 500){
        descuento = importe * 0.12;
    }
    else if(importe > 500 and importe <= 700){
        descuento = importe * 0.14;
    }
    else{
        descuento = importe * 0.14;
    }

   if (unidades > 0 and unidades <= 50){
        caramelos = 5;
    }
    else if (unidades > 50 and unidades <= 100){
        caramelos = 10;
    }
    else{
        caramelos = 15;
    }
    cout<<"Importe de la compra: "<<importe<<" soles."<<endl;
    cout<<"Descuento           : "<<descuento<<" soles."<<endl;
    cout<<"Total a pagar       : "<<total<<" soles."<<endl;
    cout<<"Caramelos           : "<<caramelos<<" caramelos."<<endl;
}