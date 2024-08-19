'''
Desarrolle el programa que determine el área y el perímetro de un rectángulo sabiendo que
   área = b x h, perímetro = 2x (b+h).
'''

import os
os.system("cls")

#Datos
base = int(input("Base: "))
altura = int(input("Altura:"))

#Proceso
area = base * altura
perimetro = 2 * (base + altura)

#Salida

print(f"Área: {area}")
print(f"Perímetro: {perimetro}")