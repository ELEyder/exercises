#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    float a,b,c,d,x1,x2,r1,r2;
    printf("a: "); cin>>a;
    printf("b: "); cin>>b;
    printf("c: "); cin>>c;
    x1 = (-b + sqrt(b*b-4*a*c))/(2*a);
    x2 = (-b - sqrt(b*b-4*a*c))/(2*a);

    cout<<"R1: "<<x1<<" y "<<x2<<endl;
}