'''
26.Una empresa ha decidido adquirir varias piezas de la misma clase
a una fábrica de refacciones. La empresa dependiendo del monto total
de la compra, decidirá qué hacer para pagar al fabricante. Si el monto
total de la compra excede de $ 5000, la empresa pedirá prestado al banco
el 30%; en caso contrario, el préstamo será del 20%. La diferencia la
cubrirá con su propio dinero. Desarrolle el programa que determine
cuánto tendrá que pagar la empresa de su propio dinero y del préstamo
considerando que el banco le cobrará el 10% por concepto de interés.
'''

import os
os.system("cls")

compra = int(input("Compra:"))

if compra > 5000:
    prestamo = compra * 0.30
else:
    prestamo = compra * 0.30
empresa = compra - prestamo

devolver = prestamo * 0.1

print(f"Empresa da: S/. {empresa:.2f}")
print(f"Se devuelve al banco: S/. {devolver:.2f}")