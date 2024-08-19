'''
33.Una empresa evalúa a sus empleados bajo dos criterios:
puntualidad y rendimiento. En cada caso, el empleado recibe
un puntaje que va de 1 a 10, de acuerdo a los siguientes criterios:
Puntaje por puntualidad, está en función a los minutos de tardanza.
Puntaje por rendimiento, está en función a la cantidad de observaciones
efectuadas al empleado por no cumplir sus obligaciones.
El puntaje total del empleado es la suma del puntaje por puntualidad
más el de rendimiento; en base a este puntaje total, el empleado recibe
una bonificación anual. Desarrolle el programa que calcule los puntajes
y la bonificación que le corresponde a un empleado.

Tardanza(min)   Puntaje		Observaciones	Puntaje     Total	    Bonificación
    0             10		      0           10        < 11	    S/.   2.5 por punto
  1 a 2	          8		          1           8         11 a 13	    S/.   5.0 por punto
  3 a 5	          6		          2           5         14 a 16	    S/.   7.5 por punto
  6 a 9	          4		          3           1         17 a 19	    S/. 10.0 por punto
 Más de 9	      0		      Más de 3        0         20 >	    S/. 12.5 por punto
'''
import os
os.system("cls")

tardanza =  int(input("Tardanza (minutos): "))
rendimi = int(input("Observaciones: "))

if tardanza == 0: puntaje = 10
elif 1 <= tardanza <= 2: puntaje = 8
elif 3 <= tardanza <= 5: puntaje = 6
elif 6 <= tardanza <= 9: puntaje = 4
elif tardanza > 9: puntaje = 0

if rendimi == 0: puntaje2 = 10
elif rendimi == 1: puntaje2 = 8
elif rendimi == 2: puntaje2 = 5
elif rendimi == 3: puntaje2 = 1
elif rendimi > 3: puntaje2 = 0

totalPuntos = puntaje + puntaje2

if totalPuntos <= 11: bono = 2.5 * totalPuntos
elif 11 <= totalPuntos <= 13: bono = 2.5 * totalPuntos
elif 14 <= totalPuntos <= 16: bono = 5 * totalPuntos
elif 17 <= totalPuntos <= 19: bono = 7.5 * totalPuntos
elif totalPuntos == 20: bono = 10 * totalPuntos
print()
print(f"Tardanza (Puntos): {puntaje} puntos.")
print(f"Observaciones (Puntos): {puntaje2} puntos.")
print(f"Bonificación: S/. {bono}")