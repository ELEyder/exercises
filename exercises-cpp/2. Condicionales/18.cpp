#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    float monto,salud,comedor,bolsa;

    printf("Donación: "); cin>>monto;

    if (monto >= 10000){
        salud = monto * 0.3;
        comedor = monto * 0.5;
        bolsa = monto - (salud + comedor);
    }
    else{
        salud = monto * 0.25;
        comedor = monto * 0.60;
        bolsa = monto - (salud + comedor);
    }
    cout<<"Cantidad donada:"<<endl;
    cout<<"Centro de Salud     : "<<salud<<endl;
    cout<<"Comedor de Niños    : "<<comedor<<endl;
    cout<<"Invierte en la bolsa: "<<bolsa<<endl;
}