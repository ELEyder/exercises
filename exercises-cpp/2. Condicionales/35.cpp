 #include <iostream>
#include <cstdio>
#include <strings.h>
#include <conio.h>
using namespace std;

int main(){
    system("cls");

    int codigo;

    printf("Código: ");cin>>codigo;


    if (codigo % 2 == 0 and codigo % 3 == 0 and codigo % 5 == 0) printf("Empleado: Administrativo.");
    else if (codigo % 3 == 0 and codigo % 5 == 0 and codigo % 2 != 0) printf("Empleado: Directivo.");
    else if (codigo & 2 == 0 and codigo % 3 != 0 and codigo % 25!= 0) printf("Empleado: Vendedor.");
    else if (codigo & 2 != 0 and codigo % 3 != 0 and codigo % 25!= 0) printf("Empleado: Seguridad.");
}