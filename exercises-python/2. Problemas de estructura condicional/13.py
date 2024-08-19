'''
13.Desarrolle el programa que lea un número entero positivo de tres cifras
y determine si las cifras son o no consecutivas (en orden ascendente o descendente).
En caso contrario mostrar mensaje.
'''

import os
os.system("cls")

#Datos
num = input("Número: ")
num1 = int(num[0])
num2 = int(num[1])
num3 = int(num[2])

#Conparación
if num1 == num2 - 1 == num3 - 2: print("Ascendente")
elif num1 == num2 + 1 == num3 + 2: print("Descendente")
else: print("No son consecutivas.")