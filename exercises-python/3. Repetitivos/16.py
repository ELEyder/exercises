'''
16.Desarrolle el método que invierta una cadena de texto.
'''
import os
os.system("cls")

texto = input("Texto: ")
nuevo = ""
for i in texto:
    nuevo = i + nuevo
print(nuevo)