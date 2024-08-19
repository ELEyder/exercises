'''
25.Una empresa ha decidido otorgar una bonificación por fiestas patrias
a sus empleados. Si el empleado tiene más de un hijo, recibirá una bonificación
igual al 12.5% de su sueldo bruto más S/. 40 por cada hijo; en caso contrario,
recibirá una bonificación del 10%. Elaborar el programa que muestre la bonificación
y el sueldo neto a pagar.
'''

import os
os.system("cls")

try:
    sueldoBruto = int(input("Sueldo Bruto: "))
    hijos = int(input("Hijos: "))

    if hijos > 1:
        bonifica = (sueldoBruto * 0.125) + (40 * hijos)
    else:
        bonifica = sueldoBruto * 0.1
    print(f"El bono que recibirá el empleado es: S/. {bonifica:.2f}")
except:
    print("Algo salió mal.")