'''
6.Diseñe el programa que genera la tabla de multiplicar de un número n, tablas del x al y. 
'''
from http.client import INSUFFICIENT_STORAGE
import os
os.system("cls")

num = int(input("Número: "))
inicio = int(input("Inicio: "))
final = int(input("Final: "))

for i in range(inicio,final+1):
    print(f"{num} x {i} = {num*i}")