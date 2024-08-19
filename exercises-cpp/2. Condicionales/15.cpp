#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    float montoVendido,comision,descuento,sueldoTotal,sueldoBruto;
    int sueldoBasico = 250;

    printf("Monto vendido: "); cin>>montoVendido;

    if (montoVendido <= 5000) comision = montoVendido * 0.05;
    else if (montoVendido > 5000 and montoVendido <= 10000) comision = montoVendido * 0.08;
    else if (montoVendido > 10000 and montoVendido <= 20000) comision = montoVendido * 0.10;
    else if (montoVendido > 20000) comision = montoVendido * 0.15;

    sueldoBruto = montoVendido + comision;

    if (sueldoBruto > 3500) descuento = sueldoBruto * 0.15;
    else descuento = sueldoBruto * 0.08;

    sueldoTotal = sueldoBruto - descuento;

    cout<<"Comisión: "<<comision<<endl;
    cout<<"Suedo Bruto: "<<sueldoBruto<<endl;
    cout<<"Descuento: "<<descuento<<endl;
    cout<<"Suedo Neto: "<<sueldoTotal<<endl;
}