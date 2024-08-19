#include<iostream>
using namespace std;

int main() {
    system("cls");
    int numero;
    cout<<"Numero: "; cin>>numero;

    int a = 0;
    for(int i=1; i<=numero; i++){
        if( numero % i == 0 ) { a++; }
    }

    if(a==2) {cout<<"Es primo";}
    else {cout<<"No es primo";}

    return 0;
}