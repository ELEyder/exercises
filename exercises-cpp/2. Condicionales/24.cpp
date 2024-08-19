#include <iostream>
#include <cstdio>
#include <strings.h>
#include <conio.h>
using namespace std;

int main(){
    system("cls");

    int vendido,sueldo,sueldo2,sueldoTotal,propina3;

    printf("Nota (Matematica): "); cin>>vendido;

    sueldo = vendido * 0.1;

    if (vendido > 5000) sueldo2 = (vendido / 500) * 25;
    sueldoTotal = sueldo + sueldo2;

    cout<<"Sueldo Total: "<<sueldoTotal<<endl;

}