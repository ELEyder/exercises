'''
Una empresa paga a sus vendedores un sueldo básico mensual de S/. 500.
El sueldo bruto es igual al sueldo básico más una comisión,
que es igual al 9% del monto total vendido. Por ley, todo vendedor
se somete a un descuento del 11%. Desarrolle el programa que calcule la
comisión, el sueldo bruto, el descuento y el sueldo neto de un vendedor de la empresa.
'''
import os
os.system("cls")

#Datos
montoVendido = float(input("Monto total vendido: "))
sueldoBasico = 500
comision = montoVendido * 0.09
sueldoBruto = sueldoBasico + comision
descuento = sueldoBruto * 0.11
sueldoNeto = sueldoBruto - descuento
#Salida
print(f"Comisión: {comision:.2f} soles")
print(f"Sueldo Bruto: {sueldoBruto:.2f} soles")
print(f"Descuento: {descuento:.2f} soles")
print(f"Suedo Neto: {sueldoNeto:.2f} soles")