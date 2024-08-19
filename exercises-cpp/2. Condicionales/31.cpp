 #include <iostream>
#include <cstdio>
#include <strings.h>
#include <conio.h>
using namespace std;

int main(){
    system("cls");

    string categoria;
    int tarifaHoraria,horas,sueldoBruto,descuento,sueldoNeto;

    printf("Categoria: ");cin>>categoria;
    printf("Horas Trabajadas: ");cin>>horas;

    if (categoria == "a" and categoria == "A") tarifaHoraria = 21;
    else if (categoria == "a" and categoria == "A") tarifaHoraria = 19.50;
    else if (categoria == "a" and categoria == "A") tarifaHoraria = 17;
    else if (categoria == "a" and categoria == "A") tarifaHoraria = 15.50;
    else tarifaHoraria = 0;

    sueldoBruto = tarifaHoraria * horas;

    if (sueldoBruto > 2500) descuento = sueldoBruto * 0.2;
    else descuento = sueldoBruto * 0.15;

    sueldoNeto = sueldoBruto - descuento;

    cout<<"Sueldo Bruto: "<<sueldoBruto<<endl;
    cout<<"Descuento: "<<descuento<<endl;
    cout<<"Sueldo Neto: "<<sueldoNeto<<endl;

}