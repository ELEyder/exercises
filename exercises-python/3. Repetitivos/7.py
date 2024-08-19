'''
7.Desarrolle el programa que genere la factorial de un número. 
'''
import os
os.system("cls")
num = int(input("Número: "))
factorial = 1

for i in range(1,num+1):
    factorial *= i
print(f"Factorial: {factorial}")