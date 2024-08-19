 #include <iostream>
#include <cstdio>
#include <strings.h>
#include <conio.h>
using namespace std;

int main(){
    system("cls");

    int compra,prestamo,empresa,devolver,propina3;

    printf("Compra: "); cin>>compra;

    if (compra > 5000) prestamo = compra * 0.30;
    else prestamo = compra * 0.30;

    empresa = compra - prestamo;
    devolver = prestamo * 0.1;

    cout<<"Empresa da: S/. "<<empresa<<endl;
    cout<<"Se devuelve al banco: S/. "<<devolver<<endl;

}