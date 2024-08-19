'''
5.Desarrolle el programa que, dado un número de 4 cifras, forme el mayor
número posible de dos cifras usando la mayor y menor cifra del número ingresado.
'''

import os
os.system("cls")

#Número
num = input("Número (4 cifras): ")

lista = [num[0],num[1],num[2],num[3]]
lista.sort()

print(max(lista)+min(lista))

'''
#Condicional
if num[0] > num[1]:
    if num[0] > num[2]:
        if num[0] > num[3]:
            mayor = num[0]
            menor = 
        else:
            mayor = num[3]
else:
    if num[1] > num[2]:
        if num[1] > num [3]:
            mayor = num[1]

    elif num [2] > num[3]:
        mayor = num[2]
    else:
       mayor = num[3]
'''