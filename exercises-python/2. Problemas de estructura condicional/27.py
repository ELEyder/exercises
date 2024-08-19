'''
27.Una empresa paga a sus vendedores un sueldo bruto igual a la suma
de un sueldo básico de S/. 600 más una comisión igual al 15% del monto
total vendido. Por otro lado, si el sueldo bruto es mayor a S/. 1800 se
le descontará el 10%, en caso contrario será 5%. Además, como incentivo
la empresa obsequia 3 polos si el monto vendido es mayor a S/. 1000 sino
si obsequia sólo 1. Desarrolle el programa que determine el sueldo bruto,
el descuento y el sueldo neto y el número de polos que son obsequiados.
'''
import os
os.system("cls")

sueldoBasi = 600
vendido = int(input("Vendido: S/."))
comision = vendido * 0.15
sueldoBruto = sueldoBasi + comision
if sueldoBruto > 1800:
    descuento = sueldoBruto * 0.10
    sueldoNeto = sueldoBruto - descuento
else:
    descuento = sueldoBruto * 0.05
    sueldoNeto = sueldoBruto - descuento
if vendido > 1000:
    polo = 3
else:
    polo = 1
print()
print(f"Sueldo Bruto: {sueldoBruto:.2f}")
print(f"Descuento: {descuento:.2f}")
print(f"Sueldo Neto: {sueldoNeto:.2f}")
print(f"Polos obsequidos: {polo}")
