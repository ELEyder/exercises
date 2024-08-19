'''
36.En una tienda obsequian lapiceros Lucas, Faber y Pilot por la compra de
cuadernos de acuerdo a lo siguiente: Si el número de cuadernos adquiridos
es menos que 12, no se obsequia ningún lapicero. Si el número de cuadernos
adquiridos es no menos que 12, pero menos que 24, se obsequia 1 lapicero
Lucas por cada 4 cuadernos adquiridos. Si el número de cuadernos adquiridos
es no menos de 24, pero menos que 36, se obsequia 2 lapiceros Faber por cada
4 cuadernos adquiridos. Si el número de cuadernos adquiridos es no menos de
36, se obsequia 2 lapiceros Pilot por cada 4 cuadernos adquiridos, más 1
lapicero Faber por cada 6 cuadernos adquiridos y 1 lapicero Lucas por cada
12 cuadernos adquiridos. Desarrolle el programa que determine cuántos lapiceros
se obsequia a un cliente.
'''

import os
os.system("cls")

cuadernos = int(input("Cuadernos: "))
lucas = 0
faber = 0
pilot = 0
if cuadernos < 12: pass
elif 24 > cuadernos >= 12:
    lucas = cuadernos // 4
elif 36 > cuadernos >= 24:
    faber = (cuadernos // 4) * 2
elif cuadernos >= 36:
    pilot = (cuadernos // 4) * 2
    faber = cuadernos // 6
    lucas = cuadernos // 12

print(f"Lapiceros Lucas: {lucas}")
print(f"Lapiceros Faber: {faber}")
print(f"Lapiceros Pilot: {pilot}")
