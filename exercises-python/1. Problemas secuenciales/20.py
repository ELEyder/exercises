'''
20.Dada una cantidad de dinero en soles, desarrolle el programa que descomponga dicha
cantidad en billetes de 200, 100, 50, 20, 10 y monedas de 5, 2, 1 nuevos soles.
'''

import os
os.system("cls")
#Datos
from doctest import DocFileSuite

dinero = int(input("Dinero: "))

#Billetes
doscientos = dinero // 200
dinero %= 200

cien = dinero // 100
dinero %= 100

cincuenta = dinero // 50
dinero %= 50

veinte = dinero // 20
dinero %= 20

diez = dinero // 10
dinero %= 10

cinco = dinero // 5
dinero %= 5

dos = dinero // 2
dinero %= 2

uno = dinero // 1
dinero %= 1

print(f"Billetes de 200 soles: {doscientos}")
print(f"Billetes de 100 soles: {cien}")
print(f"Billetes de 50 soles : {cincuenta}")
print(f"Billetes de 20 soles : {veinte}")
print(f"Billetes de 10 soles : {cien}")
print(f"Monedas de 5 soles   : {cinco}")
print(f"Billetes de 2 soles  : {dos}")
print(f"Billetes de 1 sol    : {uno}")