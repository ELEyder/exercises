 #include <iostream>
#include <cstdio>
#include <strings.h>
#include <conio.h>
using namespace std;

int main(){
    system("cls");

    int matePC1,matePC2,matePC3,mateEP,mateEF;
    int fisicaPC1,fisicaPC2,fisicaPC3,fisicaEP,fisicaEF;
    int quimicaPC1,quimicaPC2,quimicaPC3,quimicaEP,quimicaEF;
    int mate,fisica,quimica,promedioTotal;
    string logroMate,logroFisica,logroQuimica,logro;

    printf("Horas de Ausencia: ");cin>>matePC1;
    printf("Tornillos Defectuosos: ");cin>>matePC2;
    printf("Tornillos No Defectuosos: ");cin>>matePC3;
    printf("a: ");cin>>mateEP;
    printf("a: ");cin>>mateEF;
    printf("a: ");cin>>fisicaPC1;
    printf("a: ");cin>>fisicaPC2;
    printf("a: ");cin>>fisicaPC3;
    printf("a: ");cin>>fisicaEP;
    printf("a: ");cin>>fisicaEF;
    printf("a: ");cin>>quimicaPC1;
    printf("a: ");cin>>quimicaPC2;
    printf("a: ");cin>>quimicaPC3;
    printf("a: ");cin>>quimicaEP;
    printf("a: ");cin>>quimicaEF;

    mate = matePC1*0.1 + matePC2*0.2 + matePC3*0.1 + mateEP*0.3 + mateEF*0.3;
    fisica = fisicaPC1*0.2 + fisicaPC2*0.2 + fisicaPC3*0.2 + fisicaEP*0.2 + fisicaEF*0.2;
    quimica = quimicaPC1*0.1 + quimicaPC2*0.3 + quimicaPC3*0.1 + quimicaEP*0.25 + quimicaEF*0.25;

    promedioTotal = (mate + fisica + quimica) / 3;

    if (mate < 13)logroMate = "Desaprobado";
    else logroMate = "Aprobado";

    if (fisica < 13) logroFisica = "Desaprobado";
    else logroFisica = "Aprobado";

    if (quimica < 13) logroQuimica = "Desaprobado";
    else logroQuimica = "Aprobado";

    if (promedioTotal < 13) logro = "Desaprobado";
    else logro = "Aprobado";

    cout<<"Promedio de Matemáticas: "<<mate<<"/"<<logroMate<<endl;
    cout<<"Promedio de Física     : "<<fisica<<"/"<<logroFisica<<endl;
    cout<<"Promedio de Química    : "<<quimica<<"/"<<logroQuimica<<endl;
    cout<<"Promedio Total         : "<<promedioTotal<<"/"<<logro<<endl;
}