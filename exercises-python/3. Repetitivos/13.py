'''
13.Desarrolle el programa que halle la suma de todos los números enteros múltiplos de 3,
pero no de 5, que sean menores o iguales a n.
'''

import os
os.system("cls")

rango = int(input("Rango: "))

suma = 0
for x in range(rango):
    if x % 3 == 0 and x % 5 != 0:
        suma += x
print(f"La suma de los números multiplos de 3 y no multiplos de 5: {suma}")