'''
Dado dos números enteros de 3 cifras, desarrolle el programa que muestre
la cifra primera y tercera cifras intercambiadas entre ambos números.
Ejemplo 123 y 456  624 y 351
'''
#Datos
num1 = input("Primer número: ")
num2 = input("Segundo número: ")

#Proceso
num3 = num2[2] + num1[1] + num2[0]
num4 = num1[2] + num2[1] + num1[0]

#Salida
print("")
print("Números intercambiados:")
print(num3)
print(num4)