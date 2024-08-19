 #include <iostream>
#include <cstdio>
#include <strings.h>
#include <conio.h>
using namespace std;

int main(){
    system("cls");

    string categoria;
    int tarifaHoraria,horas,pension,promedio,descuento,pensionTotal;

    printf("Categoria: ");cin>>categoria;
    printf("Promedio de Notas: ");cin>>horas;

    if (categoria == "a" and categoria == "A") pension = 550;
    else if (categoria == "b" and categoria == "B") pension = 500;
    else if (categoria == "c" and categoria == "C") pension = 450;
    else if (categoria == "d" and categoria == "D") pension = 400;
    else pension = 0;

    if (promedio < 14) descuento = 0;
    else if (promedio < 16) descuento = 0.1;
    else if (promedio < 18) descuento = 0.12;
    else if (promedio <= 20) descuento = 0.15;
    else descuento = 0;

    pensionTotal = pension - descuento;

    cout<<"Pension: "<<pension<<endl;
    cout<<"Descuento: "<<descuento<<endl;
    cout<<"Pension Total: "<<pensionTotal<<endl;

}