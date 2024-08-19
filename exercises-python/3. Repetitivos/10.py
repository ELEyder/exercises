'''
10.Desarrolle el programa que muestre todos los números de 4 cifras
que cumplen la condición de que la suma de las cifras pares es igual
a la suma de las cifras impares, muestre además la cantidad de números encontrados.
'''
import os
os.system("cls")

par=0
impar=0
count = 0

for i in range(1000,10000):
    i=str(i)
    for x in i:
        a = int(x)
        if a % 2 == 0:
            par += a
        else:
            impar += a
    if par == impar:
        print(i,end=" ")
        count += 1
        if count % 20 == 0: print()
    par = 0
    impar = 0
print()
print()
print(f"Se encontraron {count} números.")