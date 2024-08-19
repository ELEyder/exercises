'''
3.Los ángulos se clasifican de la siguiente manera: nulo (0°), Agudo (0°< x < 90°),
Recto (90°), Obtuso (90° < x <180°), Llano (180°), Cóncavo (180°< x < 360°),
Completo (360°). Desarrolle el programa que determine la clasificación de un ángulo dado en grados.
'''

import os
os.system("cls")

#Datos
angulo = float(input("Ángulo: "))

#Comparación y salida
if angulo < 90:
    print("Ángulo Agudo.")
elif angulo == 90:
    print("Ángulo Recto.")
elif angulo > 90 and angulo < 180:
    print("Ángulo Obtuso.")
elif angulo == 180:
    print("Ángulo Llano.")
elif angulo > 180 and angulo < 360:
    print("Ángulo Cóncavo.")
elif angulo == 360:
    print("Ángulo Completo.")
else:
    print("Fuera de Rango")