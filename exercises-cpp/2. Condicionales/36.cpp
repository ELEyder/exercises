 #include <iostream>
#include <cstdio>
#include <strings.h>
#include <conio.h>
using namespace std;

int main(){
    system("cls");

    int cuadernos,lucas,faber,pilot,a;

    printf("Categoria: ");cin>>cuadernos;

    if (cuadernos < 12) a=1;
    else if (24 > cuadernos >= 12)lucas = cuadernos / 4;
    else if (36 > cuadernos >= 24)faber = (cuadernos / 4) * 2;
    else if (cuadernos >= 36){
        pilot = (cuadernos / 4) * 2;
        faber = cuadernos / 6;
        lucas = cuadernos / 12;
    }
    cout<<"Lapiceros Lucas: "<<lucas<<endl;
    cout<<"Lapiceros Faber: "<<faber<<endl;
    cout<<"Lapiceros Pilot: "<<pilot<<endl;

}