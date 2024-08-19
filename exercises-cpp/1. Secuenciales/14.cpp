#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    float a,b,c,d,e;
    printf("a: "); cin>>a;
    printf("b: "); cin>>b;
    printf("c: "); cin>>c;
    printf("d: "); cin>>d;
    printf("e: "); cin>>e;

    float lista[5] = {a , b , c , d , e};
    for (int i=0;i<5;i++){
        for (int j = i+1; j < 5 ; j++){
            if (lista[i] < lista[j]){
                int temp = lista[j];
                lista[j] = lista[i];
                lista[i] = temp;
            }
        }
    }

    cout<<"Mayor: "<<lista[0]<<endl;
    cout<<"Menor: "<<lista[4]<<endl;
}