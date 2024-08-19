'''
12.Desarrolle el programa que muestre los números de 1 a 100 a razón de 10 números por fila.
'''

import os
os.system("cls")

for i in range(1,101):
    print(i,end=" ")
    if i > 0 and i < 10: print(" ",end="")
    if i % 10 == 0 and i > 9:
        print()