#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    int dinero,doscientos,cien,cincuenta,veinte,diez,cinco,dos,uno;

    printf("Dinero: "); cin>>dinero;

    doscientos = dinero / 200;
    dinero %= 200;

    cien = dinero / 100;
    dinero %= 100;

    cincuenta = dinero / 50;
    dinero %= 50;

    veinte = dinero / 20;
    dinero %= 20;

    diez = dinero / 10;
    dinero %= 10;

    cinco = dinero / 5;
    dinero %= 5;

    dos = dinero / 2;
    dinero %= 2;

    uno = dinero / 1;
    dinero %= 1;

    cout<<"Billetes de 200 soles: "<<doscientos<<endl;
    cout<<"Billetes de 100 soles: "<<cien<<endl;
    cout<<"Billetes de 50 soles: "<<cincuenta<<endl;
    cout<<"Billetes de 20 soles: "<<veinte<<endl;
    cout<<"Billetes de 10 soles: "<<diez<<endl;
    cout<<"Monedas de 5 soles  : "<<cinco<<endl;
    cout<<"Monedas de 2 soles  : "<<dos<<endl;
    cout<<"Monedas de 1 soles  : "<<uno<<endl;


}