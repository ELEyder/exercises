''' Desarrolle el programa que determine el porcentaje
de varones y mujeres que hay en un salon de clases '''
import os
os.system("cls")

#Creando variables
varones = int(input("Cantidad varones: "))
mujeres = int(input("Cantidad mujeres: "))
total = varones + mujeres

#Calculando
pVarones = varones * 100 / total
pMujeres = mujeres * 100 / total

#Salida
print(f"Varones: {pVarones:.2f}")
print(f"Mujeres: {pMujeres:.2f}")
