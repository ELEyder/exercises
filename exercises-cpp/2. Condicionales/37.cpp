 #include <iostream>
#include <cstdio>
#include <strings.h>
#include <conio.h>
using namespace std;

int main(){
    system("cls");

    int pamela,carol,fanny,total,a;
    

    printf("Pamela: ");cin>>pamela;
    printf("Carol: ");cin>>carol;
    printf("Fanny: ");cin>>fanny;

    int listaOrden[3]={pamela,carol,fanny};

    for (int i = 0; i < 3;i++){
        for (int j = 0; j < 3;j++){
            if(listaOrden[i] < listaOrden[j]){
                int temp = listaOrden[j];
                listaOrden[j] = listaOrden[i];
                listaOrden[i] = temp;
            }
        }
    }
    total = pamela + carol + fanny;
    if (listaOrden[2] == pamela && listaOrden[2] != listaOrden[1] && pamela > (total / 2)){
        cout<<"Ganó Pamela"<<endl;
    }
    else if (listaOrden[2] == carol && listaOrden[2] != listaOrden[1] && carol > (total / 2)){
        cout<<"Ganó Carol"<<endl;
    }
    else if (listaOrden[2] == fanny && listaOrden[2] != listaOrden[1] && fanny > (total / 2)){
        cout<<"Ganó Fanny"<<endl;
    }
    else if (listaOrden[2] == listaOrden[1]){
        cout<<"Anulado"<<endl;
    }
    else if (listaOrden[0] == listaOrden[1] == listaOrden[2] or listaOrden[0] == listaOrden[1]){
        cout<<"Elecciones anuladas"<<endl;
    }
}