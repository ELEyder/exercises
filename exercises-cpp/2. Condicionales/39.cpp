 #include <iostream>
#include <cstdio>
#include <strings.h>
#include <conio.h>
using namespace std;

int main(){
    system("cls");

    int horas,torniDefec,torniNoDefec,condicion1,condicion2,condicion3;
    string nombreMes;

    printf("Horas de Ausencia: ");cin>>horas;
    printf("Tornillos Defectuosos: ");cin>>torniDefec;
    printf("Tornillos No Defectuosos: ");cin>>torniNoDefec;

    condicion1 = horas < 1.5;
    condicion2 = torniDefec < 300;
    condicion3 = torniNoDefec > 10000;

    if (condicion1 == false and condicion2 == false and condicion3 == false)printf("Grado 5");
    else if (condicion1 == true and condicion2 == false and condicion3 == false)printf("Grado 7");
    else if (condicion1 == false and condicion2 == true and condicion3 == false)printf("Grado 8");
    else if (condicion1 == false and condicion2 == false and condicion3 == true)printf("Grado 9");
    else if (condicion1 == true and condicion2 == true and condicion3 == false)printf("Grado 12");
    else if (condicion1 == true and condicion2 == false and condicion3 == true)printf("Grado 13");
    else if (condicion1 == false and condicion2 == true and condicion3 == true)printf("Grado 15");
    else if (condicion1 == true and condicion2 == true and condicion3 == true)printf("Grado 20");
    else printf("Ningun Grado.");
}