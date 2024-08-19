'''
Una persona ha recorrido tres tramos de una carretera.
La longitud del primer tramo está dada en kilómetros,
el segundo tramo en pies y el tercer tramo en millas.
Desarrolle el programa que determine la longitud total recorrida en metros y en yardas.
Considere los siguientes factores de conversión:
1 metro = 3.2808 pies, 1 milla = 1609 metros.
'''
import os
os.system("cls")

try:
    #Datos
    tramo_1 = float(input("Tramo 1 (en Km):"))
    tramo_2 = float(input("Tramo 2 (en pies):"))
    tramo_3 = float(input("Tramo 3 (em millas):"))

    #De km a metros
    tramo_1 *= 1000
    #De pies a metros
    tramo_2 /= 3.2808
    #De millas a metros
    tramo_3 /= 16909

    #Total en metros
    totalMetros = tramo_1 + tramo_2 + tramo_3

    #Total en yardas
    totalYard = totalMetros * 1.0936

    #Salida
    print("Recorrido Total:")
    print(f"En metros: {totalMetros:.2f}")
    print(f"En yardas: {totalYard:.2f}")
except:
    print("A ocurrido un error")