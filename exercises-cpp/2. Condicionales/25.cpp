 #include <iostream>
#include <cstdio>
#include <strings.h>
#include <conio.h>
using namespace std;

int main(){
    system("cls");

    int sueldoBruto,hijos,bonifica,sueldoTotal,propina3;

    printf("Sueldo Bruto: "); cin>>sueldoBruto;
    printf("Hijos: "); cin>>hijos;

    if (hijos > 1) bonifica = (sueldoBruto * 0.125) + (40 * hijos);
    else bonifica = sueldoBruto * 0.1;

    cout<<"El bono que recibirá el empleado es: S/. "<<bonifica<<endl;

}