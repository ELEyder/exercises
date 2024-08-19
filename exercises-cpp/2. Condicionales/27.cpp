 #include <iostream>
#include <cstdio>
#include <strings.h>
#include <conio.h>
using namespace std;

int main(){
    system("cls");

    int sueldoBasi,vendido,comision,sueldoBruto,descuento,sueldoNeto,polo;

    printf("Vendido: S/."); cin>>vendido;
    sueldoBasi = 600;
    comision = vendido * 0.15;
    sueldoBruto = sueldoBasi + comision;

    if (sueldoBruto > 1800){
        descuento = sueldoBruto * 0.10;
        sueldoNeto = sueldoBruto - descuento;
    }
    else{
        descuento = sueldoBruto * 0.05;
        sueldoNeto = sueldoBruto - descuento;
    }
    if (vendido > 1000){
        polo = 3;
    }
    else polo = 1;

    cout<<"Sueldo Bruto: "<<sueldoBruto<<endl;
    cout<<"Descuento: "<<descuento<<endl;
    cout<<"Sueldo Neto: "<<sueldoNeto<<endl;
    cout<<"Polos obsequidos: "<<polo<<endl;

}