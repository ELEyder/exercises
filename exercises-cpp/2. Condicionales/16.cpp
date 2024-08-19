#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    float ingresoMensual,cuotaInicial,cuotas,cuota2,cuotaFinal,cuotaInicial,ingreso2;

    printf("Ingreso mensual: "); cin>>ingresoMensual;

    if (ingresoMensual < 1250){
        cuotaInicial = 0.15;
        cuotas = 120;
        cuotaInicial = ingresoMensual * cuotaInicial;
        cuota2 = ingresoMensual - cuotaInicial;
        cuotaFinal = cuota2 / cuotas;
    }
    else if (ingresoMensual >= 1250){
        cuotaInicial = 0.30;
        cuotas = 75;
        cuotaInicial = ingresoMensual * cuotaInicial;
        ingreso2 = ingresoMensual - cuotaInicial;
        cuotaFinal = ingreso2/cuotas;
    }
    cout<<"Cuota inicial: "<<cuotaInicial<<endl;
    cout<<"Cuota final: "<<cuotaFinal<<endl;
}