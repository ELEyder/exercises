'''
11.Desarrolle el programa que muestre cuántos números capicúas hay de 3 cifras.
Un número capicúa se lee igual de izquierda a derecha como de derecha a izquierda. 
'''

import os
os.system("cls")

contador = 0

for i in range(100,1000):
    i = str(i)
    inicio = i[0]
    final = i[2]
    if inicio == final: contador += 1
print(contador)