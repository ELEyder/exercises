'''
34.El índice de masa corporal (IMC) permite medir el grado de
sobrepeso u obesidad de una persona, se calcula de la forma
IMC = peso / estatura2 Kg / m2, el resultado se muestra en la tabla.
Desarrolle el programa que calcule el IMC de una persona.
    IMC	            Grado de Obesidad
    < 20	            Delgado
    20  a 25	        Normal
    25 a 27	            Sobrepeso
    > 27	            Obesidad
'''
import os
os.system("cls")

peso = int(input("Peso: (Kg)"))
estatura = int(input("Estatura (m): "))

IMC = peso / estatura*estatura

if IMC < 20: print("Delgado.")
elif 20 <= IMC <= 25: print("Normal.")
elif 25 <= IMC <= 27: print("Sobrepeso.")
elif IMC > 27: print("Obesidad.")