'''
8.Un estudiante recibe una propina mensual S/. 20. El estudiante rinde
mensualmente tres exámenes. Su papá ha decidido incentivarlo dándole una
propina adicional de S/. 5 por cada examen aprobado. Desarrolle el programa
que determine el monto total de la propina.
'''

import os
os.system("cls")

#Propinas
propinaMensual = 20
#Notas
nota1 = int(input("Nota 1: "))
nota2 = int(input("Nota 2: "))
nota3 = int(input("Nota 3: "))

#Condicional para saber si se aprobó o no
if nota1 > 10: propinaMensual += 5
if nota2 > 10: propinaMensual += 5
if nota3 > 10: propinaMensual += 5

#Propina
print(f"Propina: {propinaMensual}")