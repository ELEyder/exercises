'''
2.Desarrolle el programa que permita multiplicar dos números enteros, no utilizar el operador *. 
'''

import os
os.system("cls")

#Datos
num1 = int(input("Multiplicando: "))
num2 = int(input("Multiplicador: "))
final = 0

#Bucle
for i in range(num2):
    final += num1

#Salida
print(final)