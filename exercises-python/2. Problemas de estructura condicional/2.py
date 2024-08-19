'''
2.Una tienda vende un producto a un precio unitario igual
a S/. 20. Como oferta la tienda ofrece un porcentaje de
descuento sobre el importe de la compra. Adicionalment
la tienda regala caramelos en base al número de unidades
adquiridas del producto. Desarrolle el programa que determine
el importe de la compra, el descuento, total a pagar y el
número de caramelos del obsequio que se da al cliente por
la compra realizada. Ver tablas siguientes:

importe             %Descuento          Unidades            Caramelos
  >700                  16%                 1 a 50              5
  501 700               14%                 51 a 100            10
  <=500                 12%                 100>                15
'''

import os
os.system("cls")

#Datos
unidades = int(input("Cantidad a comprar: "))
importe = unidades * 20

#Condicionales descuento
if importe > 0 and importe <= 500:
    descuento = importe * 0.12
elif importe > 500 and importe <= 700:
    descuento = importe * 0.14
else:
    descuento = importe * 0.14

#Condicionales Caramelos
if unidades > 0 and unidades <= 50:
    caramelos = 5
elif unidades > 50 and unidades <= 100:
    caramelos = 10
else:
    caramelos = 15

#Total
total = importe - descuento

#Salida
print(f"Importe de la compra: {importe:.2f} soles") 
print(f"Descuento           : {descuento:.2f} soles")
print(f"Total a pagar       : {total:.2f} soles")
print(f"Caramelos           : {caramelos} caramelos")