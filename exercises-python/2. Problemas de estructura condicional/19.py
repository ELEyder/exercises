'''
19.En una oficina de empleos categorizan a los postulantes en función
del sexo y de la edad de acuerdo a lo siguiente: Si la persona es de sexo
femenino: categoría FA, si tiene menos de 23 años y FB, en caso contrario.
Si la persona es de sexo masculino: categoría MA si tiene menos de 25 años y MB,
en caso contrario.
'''
import os
os.system("cls")

sexo = input("Sexo (F/M): ")
edad = int(input("Edad: "))

if sexo == "f" or "F":
    if edad < 23:
        categoria = "FA"
    else:
        categoria = "FB"

elif sexo == "m" or "M":
    if edad < 25:
        categoria = "MA"
    else:
        categoria = "MB"
else:
    print("No es una opción elegible.")

print(f"Categoria: {categoria}")