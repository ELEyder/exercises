'''
Dado un número natural de cuatro cifras, desarrolle el programa que permite obtener el número al revés.
Ejemplo 1234   4321.
'''

import os
os.system("cls")

#Datos
num = input("Número: ")
invert = ""
#Proceso
for x in num:
    invert = x + invert

print(f"Resultado: {invert}")