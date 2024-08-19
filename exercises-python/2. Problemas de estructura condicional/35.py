'''
35.En una empresa cada empleado tiene un código entero de tres cifras.
Desarrolle el programa que lea el código y determine de qué tipo de empleado
se trata de acuerdo a los siguientes criterios: Si el código es divisible por
2, por 3 y por 5, el tipo de empleado es Administrativo. Si el código por 3 y por 5,
pero no por 2, es de tipo Directivo. Si el código es divisible por 2, pero no por 3
ni por 5, es de tipo Vendedor. Si el código no es divisible por 2, 3 ni por 5, es de tipo Seguridad.
'''

import os
os.system("cls")

codigo = int(input("Código: "))
if codigo % 2 == 0 and codigo % 3 == 0 and codigo % 5 == 0: print("Empleado: Administrativo.")
elif codigo % 3 == 0 and codigo % 5 == 0 and codigo % 2 != 0: print("Empleado: Directivo.")
elif codigo & 2 == 0 and codigo % 3 != 0 and codigo % 25!= 0: print("Empleado: Vendedor.")
elif codigo & 2 != 0 and codigo % 3 != 0 and codigo % 25!= 0: print("Empleado: Seguridad.")