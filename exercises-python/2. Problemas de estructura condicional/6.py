'''
6.Desarrolle el programa que determine la edad menor y mayor de tres edades ingresadas.
'''

import os
os.system("cls")

#Datos
edad1 = int(input("Edad 1: "))
edad2 = int(input("Edad 2: "))
edad3 = int(input("Edad 3: "))
mayor = 0
menor = 0

#Comparación
if edad1 > edad2 and edad1 > edad3: mayor = edad1
elif edad2 > edad1 and edad2 > edad3: mayor = edad2
elif edad3 > edad1 and edad3 > edad2: mayor = edad3

if edad1 < edad2 and edad1 < edad3: menor = edad1
elif edad2 < edad1 and edad2 < edad3: menor = edad2
elif edad3 < edad1 and edad3 < edad2: menor = edad3

#Salida
print(f"Edad mayor: {mayor} años")
print(f"Edad menor: {menor} años")

'''
lista = (edad1 , edad2 , edad3)

print(f"Edad mayor: {max(lista)} años")
print(f"Edad menor: {min(lista)} años")

'''