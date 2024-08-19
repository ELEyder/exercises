'''
El cálculo del pago mensual de un empleado de una empresa
se efectúa de la siguiente manera: el sueldo básico se
calcula sobre la base del número total de horas trabajadas
basado en una tarifa horaria, al sueldo básico, se le aplica
una bonificación del 20% obteniéndose el sueldo bruto; al
sueldo bruto, se le aplica un descuento del 10% obteniéndose
el sueldo neto. Desarrolle el programa que muestre el sueldo
básico, bruto y neto de un trabajador.
'''

import os
os.system("cls")

#Datos
tarifaHoraria = float(input("Tarifa Horaria: "))
horasTrabajadas = float(input("Horas Trabajadas: "))

#Calculando Sueldo Básico
sueldoBasico = tarifaHoraria * horasTrabajadas

#Calculando Sueldo Bruto
sueldoBruto = sueldoBasico * 1.20

#Calculando Sueldo Neto
sueldoNeto = sueldoBruto * 0.90

#Salida
print(f"Sueldo Básico: {sueldoBasico:.2f}")
print(f"Sueldo Bruto: {sueldoBruto:.2f}")
print(f"Sueldo Neto: {sueldoNeto:.2f}")
