'''
17.Desarrolle los métodos que implementen los métodos IndexOf de la clase String.
'''

import os
os.system("cls")

texto = input("Texto: ")
busca = input("Buscar: ")
contador = 1

for i in texto:
    if busca == i:
        break
    else:
        contador += 1
if contador == len(texto) + 1:print("No se encontró") 
else: print(f"Está en la posición {contador}")