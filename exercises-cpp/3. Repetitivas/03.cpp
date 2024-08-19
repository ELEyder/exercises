#include <iostream>
#include <cstdio>

using namespace std;

int main(){
    system("cls");

    int num,count;

    printf("Número: ");cin>>num;

    for (int i = 1 ; i < num + 1 ;i++){
        if (num % i == 0) count += 1;
    }
    cout<<"Divisores: "<<count<<endl;
    
}