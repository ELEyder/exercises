'''
22.Una empresa desea adquirir cierta cantidad de unidades de dos productos
A y B a un proveedor cuyos precios son los siguientes: Producto A = S/. 25
x unidad y 15 % de descuento para más de 50 unidades adquiridas.
Producto B = S/. 30 x unidad y 10 % de descuento para más de 60 unidades adquiridas.
Desarrolle el programa que muestre el importe bruto, descuento y total a pagar por la
compra de ciertas unidades de ambos productos.
'''

import os
os.system("cls")

productoA = int(input("Producto A:"))
productoB = int(input("Producto B:"))

brutoA = productoA * 25
if productoA > 50: descuentoA = brutoA * 0.15
else: descuentoA = 0
totalA = brutoA - descuentoA

brutoB = productoB * 30
if productoB > 60: descuentoB = brutoB * 0.10
else: descuentoB = 0
totalB = brutoB - descuentoB
print()
print("Producto A:")
print(f"    Importe: {brutoA}")
print(f"    Descuento: {descuentoA}")
print(f"    Total a Pagar {totalA}")
print("Producto B:")
print(f"    Importe: {brutoB}")
print(f"    Descuento: {descuentoB}")
print(f"    Total a Pagar {totalB}")