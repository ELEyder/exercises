 #include <iostream>
#include <cstdio>
#include <strings.h>
#include <conio.h>
using namespace std;

int main(){
    system("cls");

    int cuota,dias,descuento,precarga,total;
    printf("Cuota a Pagar: "); cin>>cuota;
    printf("Día en el que pagó: "); cin>>dias;
    if (dias < 11){
        if (cuota * 0.02 > 5) descuento = cuota * 0.02;
        else descuento = 5;
        total = cuota - descuento;
    }
    else{
        descuento = 0;
        if (cuota * 0.03 > 10) precarga = cuota * 0.03;
        else precarga = 10;
        total = cuota + precarga;
    }
    
    cout<<"Total a Pagar: "<<total<<endl;

}