'''
En países de habla inglesa, es común dar la estatura de una persona
como la suma de una cantidad de pies, más una cantidad de pulgadas,
por ejemplo 3’ 2”. Desarrolle el programa que determine la estatura
en metros dada su estatura en el formato inglés.'''

import os
os.system("cls")

#Datos
alturaPies = int(input("Estatura (En pies): "))
alturaPul = int(input("Estatura faltante (En pulgadas): "))

#Conversión
alturaPiesMetros = alturaPies * 0.30480
alturaPulMetros = alturaPul * 0.0254
alturaTotal = alturaPiesMetros + alturaPulMetros

#Salida
print()
print(f"Altura total (en metros): {alturaTotal} m")
