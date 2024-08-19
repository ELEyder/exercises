'''
40.En un instituto los cursos de matemática, física y química se
evalúan en base a tres prácticas calificadas, examen parcial y final.
Cada práctica tiene un peso dado. Desarrolle el programa que determine
el promedio final del curso y su condición de aprobado / desaprobado
dado que la nota mínima es de 13.

    Curso	    PC1	    PC2	    PC3	    EP	    EF
 Matemática	    10 %	20 %	10 %	30 %	30 %     10*0.5 + 10*0.25 + 10*0.25 = 10
 Física	        20 %	20 %	20 %	20 %	20 %
 Química	    10 %	30 %	10 %	25 %	25 %
'''
import os
os.system("cls")

matePC1 = float(input("Matemática (PC1): "))
matePC2 = float(input("Matemática (PC2): "))
matePC3 = float(input("Matemática (PC3): "))
mateEP = float(input("Matemática (EP): "))
mateEF = float(input("Matemática (EF): "))
fisicaPC1 = float(input("Física (PC1): "))
fisicaPC2 = float(input("Física (PC2): "))
fisicaPC3 = float(input("Física (PC3): "))
fisicaEP = float(input("Física (EP): "))
fisicaEF = float(input("Física (EF): "))
quimicaPC1 = float(input("Química (PC1): "))
quimicaPC2 = float(input("Química (PC2): "))
quimicaPC3 = float(input("Química (PC3): "))
quimicaEP = float(input("Química (EP): "))
quimicaEF = float(input("Química (EF): "))

mate = matePC1*0.1 + matePC2*0.2 + matePC3*0.1 + mateEP*0.3 + mateEF*0.3
fisica = fisicaPC1*0.2 + fisicaPC2*0.2 + fisicaPC3*0.2 + fisicaEP*0.2 + fisicaEF*0.2
quimica = quimicaPC1*0.1 + quimicaPC2*0.3 + quimicaPC3*0.1 + quimicaEP*0.25 + quimicaEF*0.25

promedioTotal = (mate + fisica + quimica) / 3

if mate < 13: logroMate = "Desaprobado"
else: logroMate = "Aprobado"

if fisica < 13: logroFisica = "Desaprobado"
else: logroFisica = "Aprobado"

if quimica < 13: logroQuimica = "Desaprobado"
else: logroQuimica = "Aprobado"

if promedioTotal < 13: logro = "Desaprobado"
else: logro = "Aprobado"

print()
print(f"Promedio de Matemáticas: {mate:.2f} / {logroMate}")
print(f"Promedio de Física     : {fisica:.2f} / {logroFisica}")
print(f"Promedio de Química    : {quimica:.2f} / {logroQuimica}")
print(f"Promedio Total         : {promedioTotal:.2f} / {logro}")
