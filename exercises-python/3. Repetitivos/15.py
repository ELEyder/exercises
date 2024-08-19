'''
15.Desarrolle los métodos que convierta una cadena de texto a Mayúsculas y/o Minúsculas.
'''

import os
os.system("cls")

texto = input("Texto: ")
print()
eleccion = input("A Mayúsculas (1) o minusculas (2): ")
nuevo = ""
print()

mayusculas = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
'U', 'V', 'W', 'X', 'Y', 'Z','Ñ','Á','É','Í','Ó','Ú']
minusculas = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 
'u', 'v', 'w', 'x', 'y', 'z','ñ','á','é','í','ó','ú']

if eleccion == "1":
    for i in texto:
        if i in minusculas: nuevo += mayusculas[minusculas.index(i)]
        else: nuevo += i
    print(nuevo)
elif eleccion == "2":
    for i in texto:
        if i in mayusculas: nuevo += minusculas[mayusculas.index(i)]
        else: nuevo += i
    print(nuevo)
else: print("No es una opción elegible.")