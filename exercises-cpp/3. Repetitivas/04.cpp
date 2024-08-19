#include <iostream>
#include <cstdio>

using namespace std;

int main(){
    system("cls");

    int num,multiplos;

    printf("Número: ");cin>>num;
    printf("Multiplos: ");cin>>multiplos;

    int lista[multiplos];

    for (int i = 0; i < multiplos; i++){
        lista[1] = num * i;
    }
    cout<<"Divisores: "<<lista[0];
    for (int k = 1;k < multiplos;k++){
        cout<<", "<<lista[k]<<lista[k];
    }
}