#include<iostream>
using namespace std;

int main(){
    system("cls");
    int lista[10];

    for(int i=0; i<10; i++ ){
        cout<<"Numero "<<i+1<<": "; cin>>lista[i];
    }

    int aux, min;
    for(int i=0; i<10; i++){
        min = i;
        for(int j=i+1; j<10; j++){
            if( lista[j] < lista[min] ) { min = j; }
        }
        aux = lista[i];
        lista[i] = lista[min];
        lista[min] = aux;
    }

    cout<<"Promedio mayor: "<<(lista[8]+lista[9])/2<<endl;
    cout<<"Promedio menor: "<<(lista[0]+lista[1])/2<<endl;

    return 0;
}