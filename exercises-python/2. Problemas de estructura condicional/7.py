'''
7.Desarrolle el programa que lea tres números enteros y determine el número intermedio.
No use operadores lógicos en la solución.
'''

import os
os.system("cls")

#Números
num1 = int(input("Número 1:"))
num2 = int(input("Número 2:"))
num3 = int(input("Número 3:"))

#Comparacion
if num1 > num2 and num1 < num3 or num1 < num2 and num1 > num3: print(f"Número intermedio: {num1}")
elif num2 > num1 and num2 < num3 or num2 < num1 and num2 > num3: print(f"Número intermedio: {num2}")
elif num3 > num2 and num3 < num1 or num3 < num2 and num3 > num1: print(f"Número intermedio: {num3}")

'''
#Ordenando en una lista
lista = [num1, num2, num3]
lista.sort()

#Salida
print(f"Número intermedio: {lista[1]}")
'''