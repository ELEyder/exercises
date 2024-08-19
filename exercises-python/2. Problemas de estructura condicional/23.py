'''
23.Un padre ha decido dar una propina a su hijo en base a las notas
en Matemáticas y Física. Si la nota de Matemáticas es mayor a 17, le
dará S/. 3, en caso contrario sólo le dará S/. 1 por cada punto. Si
la nota de Física es mayor a S/. 15, le dará S/. 2, en caso contrario
solo S/. 0.50. Además, si el promedio de las notas es mayor a 16, le obsequiará un reloj.
'''

import os
os.system("cls")

mate = int(input("Nota (Matematica): "))
fisica = int(input("Nota (Física): "))

if mate > 17:
    propina = mate * 3
else:
    propina = mate
if fisica > 15:
    propina2 = fisica * 2
else:
    propina2 = fisica * 0.50
print(f"Propina Matemática: {propina}")
print(f"Propina Física    : {propina2}")
print(f"Propina Total     : {propina+propina2}")

if mate + fisica / 2 > 16:
    print("Regalo : Reloj")