 #include <iostream>
#include <cstdio>
#include <strings.h>
#include <conio.h>
using namespace std;

int main(){
    system("cls");

    int num,divisor,cociente,mateEP,mateEF;

    printf("Número: ");cin>>num;
    printf("Divisor: ");cin>>divisor;

    while (num >= divisor){
        num -= divisor;
        cociente +=1;
    }
    cout<<"Cociente: "<<cociente<<endl;
    cout<<"Residuo : "<<num<<endl;
    
}