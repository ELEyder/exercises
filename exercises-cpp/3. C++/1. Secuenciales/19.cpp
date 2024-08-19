#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    float montoVendido,sueldoBasico,comision,sueldoBruto,descuento,sueldoNeto;

    printf("Monto total vendido: "); cin>>montoVendido;

    sueldoBasico = 500;
    comision = montoVendido * 0.09;
    sueldoBruto = sueldoBasico + comision;
    descuento = sueldoBruto * 0.11;
    sueldoNeto = sueldoBruto - descuento;

    cout<<"Comisión: "<<comision<<endl;
    cout<<"Sueldo Bruto: "<<sueldoBruto<<endl;
    cout<<"Descuento: "<<descuento<<endl;
    cout<<"Suedo Neto: "<<sueldoNeto<<endl;

}