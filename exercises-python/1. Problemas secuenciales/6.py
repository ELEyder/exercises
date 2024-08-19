'''
Desarrolle el programa que calcule el área total y el volumen de un cilindro.
Considere las siguientes formulas:
Área = 2πr(r+h) y Volumen = πr2h. Siendo r el radio y h la altura.
'''
import math
import os
os.system("cls")

#Datos del cilindro
altura = float(input("ALtura (en cm): "))
radio = float(input("Radio (en cm): "))

#Proceso
area = 2 * math.pi * radio * (radio + altura)
volumen = math.pi * (radio ** 2) * altura

#Salida
print(f"Área: {area:.2f}cm²")
print(f"Volumen: {volumen:.2f}cm³")