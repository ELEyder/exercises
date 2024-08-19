#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    float unidades,importe,descuento,total;
    printf("Cantidad a comprar: "); cin>>unidades;

    if (unidades >= 1 and unidades <= 25){
        importe = unidades * 27;
        descuento = importe * 0.05;
    }
        
    else if(unidades >= 26 and unidades <= 50){
        importe = unidades * 25;
        descuento = importe * 0.05;
    }
    else{
        importe = unidades * 23;
        descuento = importe * 0.15;
    }

    total = importe - descuento;
    
    cout<<"Importe de la compra: "<<importe<<" dolares."<<endl;
    cout<<"Descuento           : "<<descuento<<endl;
    cout<<"Total a pagar       : "<<total<<endl;
}