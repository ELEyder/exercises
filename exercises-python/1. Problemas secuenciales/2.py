import os
os.system("cls")

try:
    #Datos
    cant = float(input("Cantidad (En metros):"))

    #Equivalentes:
    cm = cant * 100
    pul = cm / 2.54
    pies = pul / 12
    yard = pies / 3

    #Salida
    print("La equivalencia en:")
    print(f"Centímetros: {cm:.2f}")
    print(f"Pulgadas: {pul:.2f}")
    print(f"Pies: {pies:.2f}")
    print(f"Yardas: {yard:.2f}")

except:
    print("A ocurrido un error :c")