'''
20.Desarrolle el programa que lea tres números a, b, c y determine si los números
fueron ingresados en orden ascendente, descendente o en desorden.
'''

import os
os.system("cls")

num1 = int(input("Número 1:"))
num2 = int(input("Número 2:"))
num3 = int(input("Número 3:"))

if num1 == num2 - 1 == num3 - 2: print("Ascendente")
elif num1 == num2 + 1 == num3 + 2: print("Descendente")
else: print("Desordenado: ")