'''
14.En un supermercado hay una promoción según la cual el cliente raspa una tarjeta
que contiene un número oculto. Si el número de la tarjeta es par no menor de 100,
el cliente obtiene un descuento del 15 %, caso contrario será del 5 % sobre el
importe de la compra. 
Desarrolle el programa que muestre el número de la tarjeta, el monto de la compra y el descuento.
'''

import os
os.system("cls")

#Datos
monto = float(input("Monto comprado: "))
tarjeta = int(input("Número: "))

#Comparación
if tarjeta % 2 == 0 and tarjeta > 100: descuento = monto * 0.15
else: descuento = monto * 0.05

#Total
total = monto - descuento

print(f"Descuento: {descuento:.2f}")
print(f"Total a pagar: {total:.2f}")