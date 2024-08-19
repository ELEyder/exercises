#include <iostream>
#include <cstdio>

using namespace std;

int main(){
    system("cls");

    int num;
    int factorial = 1;
    printf("Número: ");cin>>num;


    for (int i = 1; i < num + 1; i++){
        factorial *= i;
    }
    cout<<"Factorial: "<<factorial<<endl;
}