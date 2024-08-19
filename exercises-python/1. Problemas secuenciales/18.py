'''
18.En una tienda han puesto en oferta la venta de todos sus artículos por cambio de 
estación ofreciendo un 15% + 15% de descuento. El primer 15% se aplica al importe de
la compra, mientras que el segundo 15% se aplica al importe que resulta de restar el
importe de la compra menos el primer descuento. Dada la cantidad de unidades adquiridas
de un mismo tipo de artículo por parte de un cliente y el precio unitario del artículo.
Desarrolle el programa que determine el importe de la compra, el descuento y el importe a pagar.
'''

import os
os.system("cls")

#Datos
unidades = int(print("Cantidad a comprar: "))
precio = int(print("Precio: "))

importeCompra = unidades * precio
pagar = (importeCompra * 0.85) * 0.85
descuento = importeCompra - pagar

#Salida
print(f"Importe de Compra: {importeCompra:.2f}")
print(f"Descuento: {descuento:.2f}")
print(f"Importe a Pagar: {pagar:.2f}")
