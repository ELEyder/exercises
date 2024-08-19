#11.Desarrolle el programa que determine el signo de un número entre positivo, negativo y cero.

import os
os.system("cls")

#Datos
num = int(input("Número: "))

#Proceso
if num > 0:
    print("Es positivo")
elif num < 0:
    print("Es negativo")
else:
    print("Es cero.")