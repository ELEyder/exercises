#include <iostream>
#include <cstdio>

using namespace std;

int main(){
    system("cls");

    int num1,num2,final,mateEP,mateEF;

    printf("Multiplicando: ");cin>>num1;
    printf("Multiplicador: ");cin>>num2;

    for (int i = 0 ; i < num2;i++){
        final += num1;
    }
    cout<<"Sale: "<<final<<endl;
    
}