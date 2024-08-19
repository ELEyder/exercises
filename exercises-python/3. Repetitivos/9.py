'''
9.Desarrolle el programa que muestre un rectángulo de asteriscos de altura n y ancho 2n, n >= 4.
'''
import os
os.system("cls")

#Datos
altura = int(input("Ancho: "))
ancho = altura * 2
print("* "*ancho)
for i in range(altura-2):
    print("* "+("  "*(ancho-2))+"*",sep=" ")

#Salida
print("* "*ancho)