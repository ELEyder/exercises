#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    int edad1,edad2,edad3,mayor,menor;

    printf("Edad 1: "); cin>>edad1;
    printf("Edad 2: "); cin>>edad2;
    printf("Edad 3: "); cin>>edad3;

    if (edad1 > edad2 && edad1 > edad3){ mayor = edad1;}
    else if (edad2 > edad1 && edad2 > edad3){ mayor = edad2;}
    else if (edad3 > edad1 && edad3 > edad2){ mayor = edad3;}

    if (edad1 < edad2 && edad1 < edad3){ menor = edad1;}
    else if (edad2 < edad1 && edad2 < edad3){ menor = edad2;}
    else if (edad3 < edad1 && edad3 < edad2){ menor = edad3;}

    cout<<"Edad mayor: "<<mayor<<endl;
    cout<<"Edad menor: "<<menor<<endl;
}