#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    float a,b,hipotenusa;
    printf("Cateto adyasente: "); cin>>a;
    printf("Cateto opuesto: "); cin>>b;

    hipotenusa = sqrt((a * a) + (b * b));

    cout<<"Hipottenusa: "<<hipotenusa<<endl;
}