'''
29.Una empresa calcula el sueldo bruto de sus trabajadores
en base a las horas trabajadas. Hasta 48 horas, se paga una
tarifa horaria normal. Para las horas extras se paga un recargo
del 20%. Por otro lado, si el sueldo bruto es superior a S/. 1500
se aplica un descuento del 11%. Desarrolle el programa que muestre
las horas trabajadas, el pago por hora, el sueldo bruto, el descuento
y el total a pagar por la empresa a sus trabajadores.
'''

import os
os.system("cls")

horas = int(input("Horas Trabajadas: "))
tarifaHoraria = int(input("Taria Horaria: "))
descuento = 0

if horas < 48:
    sueldoBruto = tarifaHoraria * horas
else:
    sueldoBruto = (tarifaHoraria * 48)
    sueldoBruto += sueldoBruto * 0.20

if sueldoBruto > 1500:
    descuento = sueldoBruto * 0.11
total = sueldoBruto - descuento

print(f"")
print(f"Pago por Horas: {tarifaHoraria}")
print(f"Sueldo Bruto: {sueldoBruto}")
print(f"Descuento: {descuento}")
print(f"Total: {total}")

