'''
31.Una empresa calcula el sueldo bruto de sus trabajadores
multiplicando las horas trabajadas por una tarifa horaria
que depende de la categoría del trabajador. Por ley, todo
trabajador se somete a un porcentaje de descuento del sueldo
bruto del 20% si supera los S/. 2500 y 15 % en caso contrario.
Desarrolle el programa que determine el sueldo bruto,
el descuento y el sueldo neto que le corresponde a un trabajador de la empresa.

Categoría	Pago por Hora
    A	      S/. 21.00
    B	      S/. 19.50
    C	      S/. 17.00
    D	      S/. 15.50
'''

import os
os.system("cls")

categoria = int(input("Categoría: "))
horas = int(input("Horas Trabajadas: "))

if categoria == "a" and categoria == "A": tarifaHoraria = 21
elif categoria == "a" and categoria == "A": tarifaHoraria = 19.50
elif categoria == "a" and categoria == "A": tarifaHoraria = 17
elif categoria == "a" and categoria == "A": tarifaHoraria = 15.50
else: tarifaHoraria = 0

sueldoBruto = tarifaHoraria * horas

if sueldoBruto > 2500: descuento = sueldoBruto * 0.2
else: descuento = sueldoBruto * 0.15

sueldoNeto = sueldoBruto - descuento

print(f"Sueldo Bruto: {sueldoBruto}")
print(f"Descuento : {descuento}")
print(f"Sueldo Neto: {sueldoNeto}")