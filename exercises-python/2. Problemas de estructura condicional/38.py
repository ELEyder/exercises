'''
38.Desarrolle el programa que determine la cantidad de días
y el nombre del mes conociendo los valores numéricos del mes
y del año. Un año es bisiesto si es divisible por 4 y no es divisible
por 100, o no es divisible por 400.
'''
import os
os.system("cls")

mes = int(input("Mes: "))
ano = int(input("Año: "))
mesDias = 0
if mes == 1:
    nombreMes = "Enero"
    mesDias = 31
elif mes == 2:
    nombreMes = "Febrero"
    if ano % 4 == 0 and ano % 100 != 0:
        mesDias = 29
    else:
        mesDias = 28
elif mes == 3:
    nombreMes = "Marzo"
    mesDias = 31
elif mes == 4:
    nombreMes = "Abril"
    mesDias = 30
elif mes == 5:
    nombreMes = "Mayo"
    mesDias = 31
elif mes == 6:
    nombreMes = "Junio"
    mesDias = 30
elif mes == 7:
    nombreMes = "Julio"
    mesDias = 31
elif mes == 8:
    nombreMes = "Agosto"
    mesDias = 31
elif mes == 9:
    nombreMes = "Septiembre"
    mesDias = 30
elif mes == 10:
    nombreMes = "Octubre"
    mesDias = 31
elif mes == 11:
    nombreMes = "Noviembre"
    mesDias = 30
elif mes == 12:
    nombreMes = "Diciembre"
    mesDias = 31
else: print("Error de número de mes.")

if mesDias != 0:
    print(f"Días del mes: {mesDias}")