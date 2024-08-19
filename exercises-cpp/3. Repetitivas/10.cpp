#include<iostream>
using namespace std;

int main() {
    system("cls");
    int a, b, c, m, contador=0;

    for (int i=1000; i<=10000; i++){
        c = i%10;
        b = (i%100-c)/10;
        a = (i%1000-b*10-c)/100;
        m= i/1000;

        if ( m==1 || m==3 || m==5 || m==7 || m==9 ){
            if (a%2==0){
                if (b%2!=0 && c%2==0){
                    if (a+c == m+b) { cout<<i<<"; "; contador++;}
                }else if (b%2==0 && c%2!=0) {
                    if (a+b == m+c) { cout<<i<<"; "; contador++;}
                }
            }else if (a%2!=0){
                if (b%2==0 && c%2==0){
                    if ( b+c == m+a) { cout<<i<<"; "; contador++;}
                }
            }
        }else if ( m==2 || m==4 || m==6 || m==8 ){
            if (a%2==0){
                if (b%2!=0 && c%2!=0){
                    if ( m+a == b+c ) { cout<<i<<"; "; contador++;}
                }
            }else if (a%2!=0){
                if (b%2!=0 && c%2==0){
                    if ( m+c == a+b) {cout<<i<<"; "; contador++;}
                }else if (b%2==0 && c%2!=0) {
                    if (m+b == a+c) {cout<<i<<"; "; contador++;}
                }
            }
        }
    }

    cout<<"\nNumeros que cumplen la condicion: "<<contador<<endl;
    return 0;
}