'''
Desarrolle el programa que lea un número entero
y determine la suma de sus cifras.
Asumir que el número es positivo y de 4 cifras.
'''
import os
os.system("cls")

#Datos
num = input("Número: ")
suma = 0
#Proceso
for i in num:
    suma = suma + int(i)

#Salida
print(f"Suma: {suma}")