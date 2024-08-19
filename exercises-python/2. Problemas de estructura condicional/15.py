'''
15.Una empresa paga a sus vendedores un sueldo que es la suma
del sueldo básico de S/. 250 más una comisión que es igual a
un porcentaje del monto total vendido, el porcentaje depende
de la categoría del vendedor como se muestra en la tabla.
Además, si el sueldo excedo los S/. 3500 se efectúa un descuento
del 15% en caso contrario del 8%. Desarrolle el programa que
muestre el sueldo bruto y neto a pagar, como también el descuento y la comisión aplicada.

Monto 	Comisión
… 5000	5 %
5000 … 10000	8 %
10000 … 20000	10 %
20000 ….	15 %
'''

import os
os.system("cls")

#Datos
sueldoBasico = 250
montoVendido = int(input("Monto vendido: "))
comision = 0
descuento = 0
sueldoTotal = 0

#Calculando comision
if montoVendido <= 5000: comision = montoVendido * 0.05
elif montoVendido > 5000 and montoVendido <= 10000: comision = montoVendido * 0.08
elif montoVendido > 10000 and montoVendido <= 20000: comision = montoVendido * 0.10
elif montoVendido > 20000: comision = montoVendido * 0.15

sueldoBruto = montoVendido + comision
if sueldoBruto > 3500: descuento = sueldoBruto * 0.15
else: descuento = sueldoBruto * 0.08

sueldoTotal = sueldoBruto - descuento

#Print
print()
print(f"Comisión: {comision:.2f}")
print(f"Suedo Bruto: {sueldoBruto:.2f}")
print(f"Descuento: {descuento:.2f}")
print(f"Suedo Neto: {sueldoTotal:.2f}")