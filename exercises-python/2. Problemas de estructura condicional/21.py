'''
21.Una empresa registra el sexo, edad y estado civil de sus empleados
a través de un número entero positivo de cuatro cifras de acuerdo a lo
siguiente: la primera cifra de la izquierda representa el estado civil
(1 soltero, 2 casado, 3 divorciado, 4 viudo); las siguientes dos cifras
representan la edad y la tercera cifra representa el sexo (1 masculino,
2 femenino). Desarrolle el programa de determine el estado civil, edad y
sexo de un empleado conociendo su número asignado.
'''

import os
os.system("cls")

codigo = input("Código: ")
if len(codigo) < 5:
    if codigo[0] == "1": civilN = "Soltero"
    elif codigo[0] == "2": civilN = "Casado"
    elif codigo[0] == "3": civilN = "Viudo"
    elif codigo[0] == "4": civilN = "Divorciado"
    else:
        civilN = "No encontrado."
    try:
        edad = int(codigo[1:3])
    except:
        edad = "No encontrado."
    if codigo[-1] == "1":
        sexoN = "Masculino"
    elif codigo[-1] == "2":
        sexoN = "Femenino"
    else:
        sexoN = "No encontrado."

    print(f"Estado Civil: {civilN}")
    print(f"Edad        : {edad}")
    print(f"Sexo        : {sexoN}")
else:
    print("El código tiene que ser de 4 cifras.")