'''
30.Una compañía cobra las cuotas mensuales de sus clientes de
acuerdo a lo siguiente: Si el cliente paga dentro de los primeros
diez días del mes, obtiene un descuento igual al mayor valor
entre $5 y el 2% de la cuota. Si el cliente paga en los siguientes
diez días, no tiene derecho a ningún descuento. Si el cliente paga
dentro de los restantes días del mes, tendrá un recargo igual al
mayor valor entre $ 10 y el 3% de la cuota. Desarrolle el programa
que determine cuánto debe pagar un cliente en un mes dado.
'''

import os
os.system("cls")

cuota = int(input("Cuota a Pagar: "))
dias = int(input("Día en el que pagó: "))

if dias < 11:

    if cuota * 0.02 > 5:
        descuento = cuota * 0.02
    else:
        descuento = 5
    total = cuota - descuento
else:
    descuento = 0
    if cuota * 0.03 > 10:
        precarga = cuota * 0.03
    else:
        precarga = 10
    total = cuota + precarga

print(f"Total a Pagar: {total}")