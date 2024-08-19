 #include <iostream>
#include <cstdio>
#include <strings.h>
#include <conio.h>
using namespace std;

int main(){
    system("cls");

    int mes,ano,mesDias;
    string nombreMes;

    printf("Mes: ");cin>>mes;
    printf("Año: ");cin>>ano;

    if (mes == 1){
        nombreMes = "Enero";
        mesDias = 31;
        }
    else if (mes == 2){
        nombreMes = "Febrero";
        if (ano % 4 == 0 and ano % 100 != 0){
            mesDias = 29;
        }
        else{
            mesDias = 28;
        }
    }
    else if (mes == 3){
        nombreMes = "Marzo";
        mesDias = 31;
    }
    else if (mes == 4){
        nombreMes = "Abril";
        mesDias = 30;
    }
    else if (mes == 5){
        nombreMes = "Mayo";
        mesDias = 31;
    }
    else if (mes == 6){
        nombreMes = "Junio";
        mesDias = 30;
    }
    else if (mes == 7){
        nombreMes = "Julio";
        mesDias = 31;
    }
    else if (mes == 8){
        nombreMes = "Agosto";
        mesDias = 31;
    }
    else if (mes == 9){
        nombreMes = "Septiembre";
        mesDias = 30;
    }
    else if (mes == 10){
        nombreMes = "Octubre";
        mesDias = 31;
    }
    else if (mes == 11){
        nombreMes = "Noviembre";
        mesDias = 30;
    }
    else if (mes == 12){
        nombreMes = "Diciembre";
        mesDias = 31;
    }
    else printf("Error de número de mes.");

    if (mesDias != 0) {
        cout<<"Días del mes: "<<mesDias<<endl;
    }
}