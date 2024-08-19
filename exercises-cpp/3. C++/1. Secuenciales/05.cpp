#include <iostream>
using namespace std;

int main() {
    system("cls");

    double gigabytes,megabytes,kilobytes,bytes;

    printf("Capacidad de disco duro (en Gigabytes): "); cin>>gigabytes;

    megabytes = gigabytes * 1024;

    kilobytes = megabytes * 1024;

    bytes = kilobytes *1024;

    printf("Conversión \n");
    printf("En megabytes: {megabytes} %.2f \n",megabytes);
    printf("En kilobytes: {kilobytes} %.2f \n",kilobytes);
    printf("En bytes: {bytes} %.2f \n",bytes);

    return 0;
}