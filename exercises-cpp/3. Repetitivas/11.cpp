#include<iostream>
using namespace std;

int main(){
    system("cls");
    int a, b, c, contador = 0;

    for (int i=100; i<=999; i++){
        a = i % 10;
        b = (i % 100 - a)/ 10;
        c = (i % 1000 - b * 10 - a)/ 100;

        if ( c==a ) { cout<<i<<"; "; contador++;}
    }

    cout<<"\nHay "<<contador<<" numeros capicuas de 3 difras."<<endl;

    return 0;
}