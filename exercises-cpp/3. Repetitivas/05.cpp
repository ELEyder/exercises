#include <iostream>
#include <cstdio>

using namespace std;

int main(){
    system("cls");

    int num;

    printf("Número: ");cin>>num;

    for (int k = 0;k < 13;k++){
        int xd = num*k;
        cout<<num<<" x "<<k<<" = "<<xd<<endl;
    }
}