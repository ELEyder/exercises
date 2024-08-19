 #include <iostream>
#include <cstdio>
#include <strings.h>
#include <conio.h>
using namespace std;

int main(){
    system("cls");

    int peso,estatura,IMC,puntaje2,totalPuntos,bono;

    printf("Peso (Kg): ");cin>>peso;
    printf("Estatura (m): ");cin>>estatura;

    IMC = peso / estatura*estatura;

    if (IMC < 20) printf("Delgado.");
    else if (20 <= IMC <= 25) printf("Normal.");
    else if (25 <= IMC <= 27) printf("Sobrepeso.");
    else if (IMC > 27) printf("Obesidad.");
}