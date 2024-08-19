#include<iostream>
#include<string.h>
using namespace std;

int main() {
    system("cls");
    char mayuscula[100], minuscula[100];
    int longitud = 0;

    cout<<"Palabra: "; gets(mayuscula);
    strcpy(minuscula,mayuscula);
    
    longitud = strlen(mayuscula);

    for(int i=0; i<=longitud-1; i++){
        if( mayuscula[i]>=97 && mayuscula[i]<=122 ) { mayuscula[i] = mayuscula[i] - 32; }

    }

    for(int i=0; i<=longitud-1; i++){
        if( minuscula[i]>=65 && minuscula[i]<=90 ) { minuscula[i] = minuscula[i] + 32; }

    }
    
    cout<<"\nMayuscula: "<<mayuscula<<endl;
    cout<<"Minuscula: "<<minuscula;

    return 0;
}