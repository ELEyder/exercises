#include <iostream>
#include <cstdio>
#include <strings.h>
#include <conio.h>
using namespace std;

int main(){
    system("cls");

    int productoA,productoB,brutoA,totalA,descuentoA,brutoB,descuentoB,totalB;

    printf("Producto A: "); cin>>productoA;
    printf("Producto B: "); cin>>productoB;

    brutoA = productoA * 25;
    if (productoA > 50) descuentoA = brutoA * 0.15;
    else descuentoA = 0;
    totalA = brutoA - descuentoA;

    brutoB = productoB * 30;
    if (productoB > 60) descuentoB = brutoB * 0.10;
    else descuentoB = 0;
    
    totalB = brutoB - descuentoB;



    cout<<"Producto A       :"<<endl;
    cout<<"    Importe      : "<<brutoA<<endl;
    cout<<"    Descuento    : "<<descuentoA<<endl;
    cout<<"    Total a Pagar: "<<totalA<<endl;
    cout<<"Producto B       :"<<endl;
    cout<<"    Importe      : "<<brutoB<<endl;
    cout<<"    Descuento    : "<<descuentoB<<endl;
    cout<<"    Total a Pagar: "<<totalB<<endl;

}