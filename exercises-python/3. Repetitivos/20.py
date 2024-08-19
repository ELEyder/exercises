'''
20.Diseñe el programa que muestre el Menor, Mayor, Promedio de una lista de 10 números.
'''
import os
os.system("cls")

lista = []
mayor = 0
menor = 0
promedio = 0
suma = 0
print("Dame 10 números:",end="")
for i in range(10):
    lista.append(int(input()))
mayor = max(lista)
menor = min(lista)

for i in lista:
    suma = suma + i
    promedio = suma/10
print(f"Mayor: {mayor}")
print(f"Menor: {menor}")
print(f"Promedio: {promedio}")