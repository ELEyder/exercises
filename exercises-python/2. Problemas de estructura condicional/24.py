'''
24.Una empresa paga a sus vendedores un sueldo igual al 10% del monto
total vendido más S/. 25 por cada S/. 500 de venta en exceso sobre S/. 5000.
Desarrolle el programa que permita calcular el sueldo de un vendedor.
'''

import os
os.system("cls")

vendido = int(print("Total Vendido: "))

sueldo = vendido * 0.1
sueldo2 = 0
if vendido > 5000:
    sueldo2 = (vendido // 500) * 25
sueldoTotal = sueldo + sueldo2

print(f"Sueldo Total: {sueldoTotal}")