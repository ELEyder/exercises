'''
14.Un número es primo si tiene únicamente dos divisores: 1 y el mismo. Desarrolle el programa.
'''

import os
os.system("cls")

numero = int(input("Número: "))
divisores = 0

for i in range(1,numero+1):
    if numero % i == 0:
        divisores += 1
if divisores == 2: print("Es primo.")
else: print("No es primo.")