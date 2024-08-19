#include <iostream>
#include <cstdio>
#include <strings.h>
#include <conio.h>
using namespace std;

int main(){
    system("cls");

    char codigo[4];
    string civilN,sexoN;

    printf("Codigo: "); cin>>codigo;

    if (strlen(codigo) < 5){
        if (codigo[0] == '1') civilN = "Soltero";
        else if (codigo[0] == '2') civilN = "Casado";
        else if (codigo[0] == '3') civilN = "Viudo";
        else if (codigo[0] == '4') civilN = "Divorciado";
        else{
            civilN = "No encontrado.";
        }
        if (codigo[-1] == '1'){
            sexoN = "Masculino";
        }
        else if (codigo[-1] == '2'){
            sexoN = "Femenino";
        }
        else{
            sexoN = "No encontrado.";
        }
        cout<<"Estado Civil: "<<civilN<<endl;
        cout<<"Edad        : "<<codigo[1]<<codigo[2]<<endl;
        cout<<"Sexo        : "<<sexoN<<endl;
    }
    else{
        printf("El código tiene que ser de 4 cifras.");
    }
}