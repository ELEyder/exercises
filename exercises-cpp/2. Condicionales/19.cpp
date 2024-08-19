#include <iostream>
#include <cstdio>
using namespace std;

int main()
{
    system("cls");
    
    string sexo,categoria;
    int edad;

    printf("Sexo (F/M): "); cin>>sexo;
    printf("Edad: "); cin>>edad;

    if (sexo == "f" or "F"){
        if (edad < 23){
            categoria = "FA";
        }
        else{
            categoria = "FB";
        }
    }
    else if (sexo == "m" or "M"){
        if (edad < 25){
            categoria = "MA";
        }
        else{
            categoria = "MB";
        }
    }
    else{
        printf("No es una opción elegible.");
    }
    cout<<"Categoria: "<<categoria<<endl;
}