 #include <iostream>
#include <cstdio>
#include <strings.h>
#include <conio.h>
using namespace std;

int main(){
    system("cls");

    int horas,tarifaHoraria,descuento,sueldoBruto,total;
    printf("Hora Trabajadas: "); cin>>horas;
    printf("Taria Horaria: "); cin>>tarifaHoraria;
    if (horas < 48){
        sueldoBruto = tarifaHoraria * horas;
    }
    else{
        sueldoBruto = (tarifaHoraria * 48);
        sueldoBruto += sueldoBruto * 0.20;
    }
    if (sueldoBruto > 1500){
        descuento = sueldoBruto * 0.11;
    }
    total = sueldoBruto - descuento;

    
    cout<<"Pago por Horas: "<<tarifaHoraria<<endl;
    cout<<"Sueldo Bruto: "<<sueldoBruto<<endl;
    cout<<"Descuento: "<<descuento<<endl;
    cout<<"Total: "<<total<<endl;

}