'''
17.Una institución social recibe anualmente una donación que reparte de la siguiente forma:
25% para el centro de salud, 35% en el comedor infantil, 25% para la escuela infantil y el
resto para el asilo de ancianos. 
Desarrolle el programa que muestre los montos asignados.
'''

import os
os.system("cls")

#Datos
donacion = float(input("Donación: "))

#Reparto
centroSalud = donacion * 0.25
comedorInfantil = donacion * 0.35
escuelaInfantil = donacion * 0.25
asiloAncianos = donacion * 0.15

#Salida
print(f"Donación al Centro de Salud: {centroSalud:.2f}")
print(f"Donación al Comedor Infantil: {comedorInfantil:.2f}")
print(f"Donación al Escuela Infantil: {escuelaInfantil:.2f}")
print(f"Donación al Asilo de Ancianos: {asiloAncianos:.2f}")