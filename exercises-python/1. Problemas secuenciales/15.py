'''
Juan, Rosa y Daniel aportan cantidades de dinero para formar un capital.
Juan y Rosa aportan en dólares y Daniel, en soles. Desarrolle el programa
que determine el capital total en dólares y que porcentaje de dicho capital
aporta cada uno. Dólar = S/. 3.00 nuevos soles.
'''

import os
os.system("cls")

#Datos
juan = int(input("Aporte de Juan: ")) #Dólares
rosa = int(input("Aporte de Rosa: ")) #Dólares
daniel = int(input("Aporte de Daniel: ")) #Soles

#Conversión
daniel = daniel / 3

#Total
total = juan + rosa + daniel

#Porcentaje
juanPorcen = 100 * juan / total
rosaPorcen = 100 * rosa / total
danielPorcen = 100 * daniel / total

#Salida
print(f"Total: {total:.2f} dólares.")
print(f"Aporte de Juan (en porcentaje): {juanPorcen:.2f}")
print(f"Aporte de Rosa (en porcentaje): {rosaPorcen:.2f}")
print(f"Aporte de Daniel (en porcentaje): {danielPorcen:.2f}")