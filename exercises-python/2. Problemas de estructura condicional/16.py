'''
16.Una empresa inmobiliaria ofrece casas bajo las siguientes condiciones:
si el ingreso mensual del comprador es menos de S/. 1250, la cuota inicial
será igual al 15% del costo de la casa y el resto se distribuirá en 120 cuotas
mensuales; pero si el ingreso mensual es mayor o igual a S/. 1250, la cuota
inicial será del 30% del costo de la casa y el resto en 75 cuotas mensuales.
Desarrolle el programa que muestre la cuota inicial y el monto de la cuota mensual.
'''

import os
os.system("cls")

ingresoMensual = int(input("Ingreso mensual: "))
cuotaInicial = 0 #15% o 30%
cuotas = 0 #120 o #75

if ingresoMensual < 1250:
    cuotaInicial = 0.15
    cuotas = 120
    cuotaInicial = ingresoMensual * cuotaInicial
    cuota2 = ingresoMensual - cuotaInicial
    cuotaFinal = cuota2 / cuotas
elif ingresoMensual >= 1250:
    cuotaInicial = 0.30
    cuotas = 75
    cuotaInicial = ingresoMensual * cuotaInicial
    ingreso2 = ingresoMensual - cuotaInicial
    cuotaFinal = ingreso2/cuotas

print(f"Cuota inicial: {cuotaInicial:.2f}")
print(f"Cuota final: {cuotaFinal:.2f}")