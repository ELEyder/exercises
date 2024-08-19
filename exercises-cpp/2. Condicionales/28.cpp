 #include <iostream>
#include <cstdio>
#include <strings.h>
#include <conio.h>
using namespace std;

int main(){
    system("cls");

    int horas,minutos,descuento,sueldoNeto,polo;

    printf("Hora: "); cin>>horas;
    printf("Hora: "); cin>>minutos;

    if (12<horas && horas<=24 && 0<=minutos && minutos<60){
		horas-=12;
        cout<<"Horas: "<<horas<<":"<<minutos<<"pm"<<endl;
    }
	if  (0<horas && horas<=12 && 0<=minutos && minutos<60){
		cout<<"Horas: "<<horas<<":"<<minutos<<"pm"<<endl;
    }
	else  cout<<"Error"<<endl;

}