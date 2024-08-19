'''
Desarrolle el programa que permita calcular la hipotenusa de un triángulo. Usando la clase Math
'''
import os
os.system("cls")
import math

#Datos
c1 = int(input("Cateto adyasente: "))
c2 = int(input("Cateto opuesto: "))

#Proceso

hipotenusa = math.sqrt((c1 ** 2) + (c2 ** 2))

#Salida
print(f"Hipottenusa: {hipotenusa}")