#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main()
{
    system("cls");
    
    float juan,rosa,daniel,total,juanPorcen,rosaPorcen,danielPorcen;
    printf("Juan: "); cin>>juan;
    printf("Rosa: "); cin>>rosa;
    printf("Daniel: "); cin>>daniel;

    daniel = daniel / 3;
    total = juan + rosa + daniel;

    juanPorcen = 100 * juan / total;
    rosaPorcen = 100 * rosa / total;
    danielPorcen = 100 * daniel / total;

    cout<<"Total: "<<total<<" dolares."<<endl;
    cout<<"Aporte de Juan (en porcentaje): "<<juanPorcen<<endl;
    cout<<"Aporte de Rosa (en porcentaje): "<<rosaPorcen<<endl;
    cout<<"Aporte de Daniel (en porcentaje): "<<danielPorcen<<endl;
}