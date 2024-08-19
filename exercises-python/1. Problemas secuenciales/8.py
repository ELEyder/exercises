'''
Desarrolle el programa que determine de un cilindro
el área base = π r2, área lateral = 2 π r h, área total = 2 x área 
base + área lateral. Siendo r el radio y h la altura.
'''
import math
import os
os.system("cls")

#Datos
altura = float(input("ALtura (en cm): "))
radio = float(input("Radio (en cm): "))

#Proceso
aBase = math.pi * (radio ** 2)
aLateral = 2 * math.pi * radio * altura
aTotal = 2 * aBase + aLateral

#Salida
print(f"Área de la Base: {aBase:.2f}")
print(f"Área de Lateral: {aLateral:.2f}")
print(f"Área Total: {aTotal:.2f}")
