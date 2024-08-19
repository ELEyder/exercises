#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    float donacion,centroSalud,comedorInfantil,escuelaInfantil,asiloAncianos;
    printf("Donacion: "); cin>>donacion;

    centroSalud = donacion * 0.25;
    comedorInfantil = donacion * 0.35;
    escuelaInfantil = donacion * 0.25;
    asiloAncianos = donacion * 0.15;

    cout<<"Donacion al Centro de Salud: "<<centroSalud<<endl;
    cout<<"Donacion al Comedor Infantil: "<<comedorInfantil<<endl;
    cout<<"Donacion al Escuela Infantil: "<<escuelaInfantil<<endl;
    cout<<"Donacion al Asilo de Ancianos: "<<asiloAncianos<<endl;

}