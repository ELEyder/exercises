'''
10.Un curso se evalúa sobre la base de 5 notas de las cuales se elimina
las notas de mayor y menor puntaje. Desarrolle el programa que muestre las
notas eliminadas y el promedio aprobatorio.
'''

import os
os.system("cls")

#Notas
nota1 = float(input("Nota 1: "))
nota2 = float(input("Nota 2: "))
nota3 = float(input("Nota 3: "))
nota4 = float(input("Nota 4: "))
nota5 = float(input("Nota 5: "))

#Mayor
if nota1 > nota2 and nota1 > nota3 and nota1 > nota4 and nota1 > nota5: mayor = nota1
elif nota2 > nota1 and nota2 > nota3 and nota2 > nota4 and nota2 > nota5: mayor = nota2
elif nota3 > nota1 and nota3 > nota2 and nota3 > nota4 and nota3 > nota5: mayor = nota3
elif nota4 > nota1 and nota4 > nota2 and nota4 > nota3 and nota4 > nota5: mayor = nota4
elif nota5 > nota1 and nota5 > nota2 and nota5 > nota3 and nota5 > nota4: mayor = nota5

#Menor
if nota1 < nota2 and nota1 < nota3 and nota1 < nota4 and nota1 < nota5: menor = nota1
elif nota2 < nota1 and nota2 < nota3 and nota2 < nota4 and nota2 < nota5: menor = nota2
elif nota3 < nota1 and nota3 < nota2 and nota3 < nota4 and nota3 < nota5: menor = nota3
elif nota4 < nota1 and nota4 < nota2 and nota4 < nota3 and nota4 < nota5: menor = nota4
elif nota5 < nota1 and nota5 < nota2 and nota5 < nota3 and nota5 < nota4: menor = nota5


print(mayor)
print(menor)
