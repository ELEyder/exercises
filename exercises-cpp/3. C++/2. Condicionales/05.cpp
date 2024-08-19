#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    char num[4];

    printf("Número (4 cifras): "); cin>>num;
    int a = num[0] - '0';
    int b = num[1] - '0';
    int c = num[2] - '0';
    int d = num[3] - '0';

    float lista[5] = {a , b , c , d};

    for (int i=0;i<4;i++){
        for (int j = i+1; j < 4 ; j++){
            if (lista[i] < lista[j]){
                int temp = lista[j];
                lista[j] = lista[i];
                lista[i] = temp;
            }
        }
    }
    cout<<"Mayor: "<<lista[0]<<endl;
    cout<<"Menor: "<<lista[3]<<endl;
}