'''
1.Un método para obtener el cociente y el resto de dos números es
por restas sucesivas. El método consiste en restar sucesivamente
el divisor del dividendo hasta obtener un resultado menor que el
divisor, que será el resto de la división; el número de restas efectuadas será el cociente. 
'''

import os
os.system("cls")

#Datos
num = int(input("Número: "))
divisor = int(input("Divisor: "))
cociente = 0
resto= 0

#Bucle
while num >= divisor:
    num -= divisor
    cociente +=1
print(f"Cociente: {cociente}")
print(f"Residuo: {num}")