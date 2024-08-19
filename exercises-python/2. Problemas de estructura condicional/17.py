'''
17.Una tienda ha puesto en oferta la venta, por docenas, de cierto tipo
de producto ofreciendo un descuento del 15% por la compra de
no menos de 6 docenas y 10% en caso contrario. Adicionalmente, la empresa
un obsequio de 2 lapiceros por cada 3 docenas por la compra de no menos de
30 docenas en caso contrario no efectúa ningún obsequio. Desarrolle el
programa que determine el monto de la compra, el descuento, total a pagar
y la cantidad de lapiceros de obsequio por la compra de cierta cantidad de docenas del producto.
'''
import os
os.system("cls")


precio = float(input("Precio del producto: "))
cantidad = int(input("Cantidad comprada: "))
compra = precio * cantidad
if cantidad < 72:
    descuento = 0.15
else:
    descuento = 0.10
if cantidad >= 360:
    lapicero = (cantidad // 36) * 2
else:
    lapicero = 0
total = compra * descuento

# Salida
print(f"Monto de la Compra   : {compra:.2f}")
print(f"Descuento            : {descuento:.2f}")
print(f"Total a Pagar        : {total:.2f}")
print(f"Lapiceros Obsequiados: {lapicero}")

