#include<iostream>
using namespace std;

int main(){
    system("cls");
    int rango, suma = 0, contador = 0;
    cout<<"Rango: "; cin>>rango;

    for (int i=0; i<=rango; i++){
        if ( i%3==0 && i%5!=0 ) {
            cout<<i<<";";
            suma +=i;
            contador++;
        }
    }

    cout<<"\nHay "<<contador<<" numeros que complen la condicion y suman " <<suma<<"."<<endl;

    return 0;
}