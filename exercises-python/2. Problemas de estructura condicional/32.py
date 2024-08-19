'''
32.En una universidad, los alumnos están categorizados en cuatro categorías,
según tabla 01. Semestralmente la universidad efectúa rebajas en las pensiones
de sus estudiantes a partir del segundo ciclo sobre la base del promedio
ponderado del ciclo anterior en porcentajes dados en la tabla 02. Desarrolle
el programa que determine la pensión actual, el descuento y la nueva pensión del estudiante.

Categoría	Pensión		Promedio	    Descuento
    A	    S/. 550		 0 a 13.99	    No hay
    B	    S/. 500		14 a 15.99	    10 %
    C	    S/. 450		16 a 17.99	    12 %
    D	    S/. 400		18 a 20	        15 %
'''
import os
os.system("cls")

categoria = input("Categoría: ")
promedio = float(input("Promedio de Notas: "))
if categoria == "a" and categoria == "A":
    pension = 550
elif categoria == "b" and categoria == "B":
    pension = 500
elif categoria == "c" and categoria == "C":
    pension = 450
elif categoria == "d" and categoria == "D":
    pension = 400
else:
    pension = 0

if promedio < 14:
    descuento = 0
elif promedio < 16:
    descuento = 0.1
elif promedio < 18:
    descuento = 0.12
elif promedio <= 20:
    descuento = 0.15
else:
    descuento = 0

pensionTotal = pension - descuento
print(f"Pensión: {pension:.2f}")
print(f"Descuento: {descuento:.2f}")
print(f"Total a Pagar: {pensionTotal:.2f}")
