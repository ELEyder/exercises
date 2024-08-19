'''
3.Desarrolle el programa que determine la cantidad de divisores de un número entero.
'''

import os
os.system("cls")

#Datos
num = int(input("Número: "))
count = 0

for i in range(1,num+1):
    if num % i == 0:
        count += 1
print(f"Divisores: {count}")