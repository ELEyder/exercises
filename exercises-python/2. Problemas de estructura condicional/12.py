'''
12.Desarrolle el programa que lea un número entero en el intervalo
de 1 a 7 correspondiente a un día de la semana, y determine el
nombre del día. Considere 1 - lunes, 2 – martes, …
'''

import os
os.system("cls")

#Datos
num = int(input("Número (del 1 al 7): "))

#Salida
if num == 1: print("Lunes")
elif num == 2: print("Martes")
elif num == 3: print("Miercoles")
elif num == 4: print("Jueves")
elif num == 5: print("Viernes")
elif num == 6: print("Sábado")
elif num == 7: print("Domingo")