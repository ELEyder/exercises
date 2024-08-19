#include<iostream>
#include<string.h>
using namespace std;

int main(){
    system("cls");
    string texto,busca;
    int posicion;
    cout<<"Texto: "; cin>>texto;
    cout<<"Buscar: "; cin>>busca;
    posicion = texto.find(busca);

    cout<<"Esta en la posicion: "<<posicion+1;
    return 0;
}