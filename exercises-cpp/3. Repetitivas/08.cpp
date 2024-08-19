#include <iostream>
#include <cstdio>

using namespace std;

int main(){
    system("cls");

    int num,potencia;
    int num2 = 1;

    printf("Número: ");cin>>num;
    printf("Potencias: ");cin>>potencia;

    for (int i = 1; i < potencia; i++){
        num2 = num2 * num;
    }
    cout<<"La potencia es : "<<num2<<endl;
}