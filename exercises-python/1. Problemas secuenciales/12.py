'''
Desarrolle el programa que permita calcular el resultado
de la ecuación de segundo grado de la forma ax2 + bx +c.
Usando la clase Math.
'''
import os
import math
os.system("cls")

#Datos
print("Ecuación ax^2+bx+c")
a = float(input("a: "))
b = float(input("b: "))
c = float(input("c: "))

#Usaremos la siguiente formula
#  -b+math.sqrt((b*b)-4*a*c))
#-------------------------------
#             (2*a)

#Resolución
x1 = (-b+math.sqrt((b*b)-4*a*c))/(2*a)
x2 = (-b-math.sqrt((b*b)-4*a*c))/(2*a)

print(f"Solución 1: {x1:.2f}")
print(f"Solución 2: {x2:.2f}")