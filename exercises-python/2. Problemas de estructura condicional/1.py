'''
Una tienda vende un producto a precios unitarios que dependen de la cantidad de unidades adquiridas.
Adicionalmente, si el cliente adquiere más de 50 unidades la tienda le descuenta el 15% del importe
de la compra; en caso contrario, sólo le descuenta el 5%.
Desarrolle el programa que determine el importe de la compra, el descuento y el total
a pagar por la compra de cierta cantidad de unidades del producto. 
1 a 25 unidades (S/. 27), 26 a 50 unidades (S/. 25), 51 en adelante unidades (S/. 23)
'''

import os
os.system("cls")

#Datos
unidades = int(input("Cantidad a comprar: "))

#Comparar para descuentos
if unidades >= 1 and unidades <= 25:
    importe = unidades * 27
    descuento = importe * 0.05
elif unidades >= 26 and unidades <= 50:
    importe = unidades * 25
    descuento = importe * 0.05
else:
    importe = unidades * 23
    descuento = importe * 0.15

#Total a pagar
total = importe - descuento
#Salida
print(f"Importe de la compra: {importe:.2f} soles") 
print(f"Descuento           : {descuento:.2f} soles")
print(f"Total a pagar       : {total:.2f} soles")