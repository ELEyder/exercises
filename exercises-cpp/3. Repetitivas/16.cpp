#include<iostream>
#include<string.h>
using namespace std;

int main(){
    system("cls");
    char cadena[100], reves[100];

    cout<<"Cadena de caracteres: "; gets(cadena);

    int longitud = strlen(cadena);

    for(int i=0; i<=longitud; i++ ){
        cout<<cadena[longitud-i];
    }

    return 0;
}