'''
5.Desarrolle el programa que genera la tabla de multiplicar de un
número n, tablas del 1 al 12. 
'''

import os
os.system("cls")

num = int(input("Número: "))

for i in range(13):
    print(f"{num} x {i} = {num*i}")