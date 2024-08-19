'''
4.El promedio final de un curso se obtiene en base al promedio simple
de tres prácticas calificadas. Para ayudar a los alumnos, el profesor
del curso ha prometido incrementar en dos puntos la nota de la tercera
práctica calificada, si es que esta no es menor que 10. Desarrolle el
programa que determine el promedio final de un alumno conociendo sus tres notas. 
'''

import os
os.system("cls")

#Datos
nota1 = float(input("Nota 1:"))
nota2 = float(input("Nota 2:"))
nota3 = float(input("Nota 3:"))

if nota3 < 10:
    nota3 += 2

#Promedio
promedio = (nota1 + nota2 + nota3) / 3

#Salida
print(f"Promedio: {promedio:.2f}")