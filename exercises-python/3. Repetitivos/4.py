'''
4.Desarrolle el programa que muestre los m múltiplos de un número n.
'''

import os
os.system("cls")

#Datos
num = int(input("Número: "))
multiplos = int(input("Multiplos: "))
lista=[]
print()
#Bucle
for i in range(multiplos):
    lista.append(num * i)

#Salida
print([i for i in lista])