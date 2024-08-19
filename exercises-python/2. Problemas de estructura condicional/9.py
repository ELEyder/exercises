'''
9.Una tienda ofrece un porcentaje de descuento sobre el importe de la compra de los
cuatro tipos de productos cuyos códigos, precios unitarios y descuentos se muestran
en las siguientes tablas. Desarrolle el programa que determine el importe de la compra,
el descuento y el total a pagar por la compra de cierta cantidad de unidades de un mismo
tipo de producto.
Codigo   Precio Unitario       Unidades     Descuento
 101    	17		            1 a 10      	5 %
 102    	25		            11 a 20	        8 %
 103    	16	                21 a 30 	    10 %
 104    	27		            31 a mas        13 %
'''

import os
os.system("cls")

#Datos
codigoProducto= int("Código del Producto: ")
cantidad = int(input("Cantidad: "))

#Precios
if codigoProducto == 101:
    precio = cantidad * 17
elif codigoProducto == 102:
    precio = cantidad * 25
elif codigoProducto == 103:
    precio = cantidad * 16
elif codigoProducto == 104:
    precio = cantidad * 27

#Descuentos
if cantidad >= 10:
    descuento = precio * 0.05
elif cantidad < 10 and cantidad >= 20:
    descuento = precio * 0.08
elif cantidad < 20 and cantidad >= 30:
    descuento = precio * 0.10
elif cantidad > 30:
    descuento = precio * 0.13

#Total
total= precio - descuento

#Salida
print(f"Importe de la compra: {precio:.2f}")
print(f"Descuento           : {descuento:.2f}")
print(f"Total a pagar       : {total:.2f}")