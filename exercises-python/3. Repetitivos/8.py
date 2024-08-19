'''
8.Desarrolle el programa que genere la potencia de un número nm.
'''

import os
os.system("cls")

num = int(input("Número: "))
potencia = int(input("Potencias: "))
num2 = 1
for i in range(potencia): num2 = num2 * num

print(num2)