#include <iostream>
#include <cstdio>
#include <strings.h>
#include <conio.h>
using namespace std;

int main(){
    system("cls");

    int mate,fisica,propina,propina2,propina3;

    printf("Nota (Matematica): "); cin>>mate;
    printf("Nota (Física): "); cin>>fisica;

    if (mate > 17)propina = mate * 3;
    else propina = mate;
    if (fisica > 15) propina2 = fisica * 2;
    else propina2 = fisica * 0.50;

    propina3 = propina + propina2;

    cout<<"Propina Matemática:"<<propina<<endl;
    cout<<"Propina Física    :"<<propina2<<endl;
    cout<<"Propina Total     :"<<propina3<<endl;

    if (mate + fisica / 2 > 16){
        printf("Regalo : Reloj");
    }
}