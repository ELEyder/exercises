'''
Desarrolle el programa que, dada la capacidad
de un disco duro en gigabytes,lo convierta a megabytes,
kilobytes y bytes.
1 KB = 1024 bytes, 1 MB = 1024 KB, 1 GB = 1024 MB.
'''

import os
os.system("cls")

# Datos
gigabytes = int(input("SCapacidad de disco duro (en Gigabytes): "))

# Conversión a megabytes
megabytes = gigabytes * 1024
# A kilobytes
kilobytes = megabytes * 1024
# A bytes
bytes = kilobytes *1024

#Salida
print("Conversión")
print(f"En megabytes: {megabytes} ")
print(f"En kilobytes: {kilobytes} ")
print(f"En bytes: {bytes}")