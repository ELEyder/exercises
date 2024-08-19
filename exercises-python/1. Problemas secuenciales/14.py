'''
Calcule el promedio de los 3 números mayores o menores de 5 números. Usando la clase Math
'''
import os
os.system("cls")

#Datos
num1 = int(input("Número 1: "))
num2 = int(input("Número 2: "))
num3 = int(input("Número 3: "))
num4 = int(input("Número 4: "))
num5 = int(input("Número 5: "))

#Ordenando
list = [num1 , num2 , num3 , num4 , num5]

#Ordenando lista
list.sort()

#Salida
print(f"Números mayores: {list[-3]},{list[-2]},{list[-1]}")
print(f"Números menores: {list[0]},{list[1]},{list[2]}")