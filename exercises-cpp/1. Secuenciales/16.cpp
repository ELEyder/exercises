#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    float tarifaHoraria,horasTrabajadas,sueldoBasico,sueldoBruto,sueldoNeto;
    printf("Tarifa Horaria: "); cin>>tarifaHoraria;
    printf("Horas Trabajadas: "); cin>>horasTrabajadas;

    sueldoBasico = tarifaHoraria * horasTrabajadas;
    sueldoBruto = sueldoBasico * 1.20;
    sueldoNeto = sueldoBruto * 0.90;

    cout<<"Sueldo Básico: "<<sueldoBasico<<endl;
    cout<<"Sueldo Bruto: "<<sueldoBruto<<endl;
    cout<<"Sueldo Neto: "<<sueldoNeto<<endl;

}