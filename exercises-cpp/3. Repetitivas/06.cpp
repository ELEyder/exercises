#include <iostream>
#include <cstdio>

using namespace std;

int main(){
    system("cls");

    int num,inicio,final;

    printf("Número: ");cin>>num;
    printf("Inicio: ");cin>>inicio;
    printf("Final: ");cin>>final;

    for (int i = inicio; i < final+1;i++){
        int xd = num*i;
        cout<<num<<" x "<<i<<" = "<<xd<<endl;
        }
}