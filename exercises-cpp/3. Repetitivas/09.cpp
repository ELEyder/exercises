#include <iostream>
#include <cstdio>

using namespace std;

int main(){
    system("cls");

    int altura;

    printf("Ancho: ");cin>>altura;
    int ancho = altura * 2;
    for (int i = 0; i < ancho; i++){
        cout<<"* ";
    }
    cout<<endl;
    for (int i = 0; i < altura-2; i++){
        cout<<"* ";
        for (int i = 0; i < ancho-2; i++)
            cout<<"  ";
        cout<<"*"<<endl;
    }
    for (int i = 0; i < ancho; i++){
        cout<<"* "; 
    }
}