'''
18.Una institución benéfica recibe anualmente una donación y lo reparte
de la siguiente manera: Si el monto es de $ 10000 o más, 30% se destina
al centro de salud; 50% al comedor de niños, y el resto se invierte en la
bolsa. Si el monto de la donación es menor a 10000, 25% se destina al centro
de salud; 60% al comedor de niños, y el resto se invierte en la bolsa.
'''
import os
os.system("cls")

monto = int(input("Donación: "))

if monto >= 10000:
    salud = monto * 0.3
    comedor = monto * 0.5
    bolsa = monto - (salud + comedor)
else:
    salud = monto * 0.25
    comedor = monto * 0.60
    bolsa = monto - (salud + comedor)
print("Cantidad donada:")
print(f"Centro de Salud     : {salud:.2f}")
print(f"Comedor de Niños    : {comedor:.2f}")
print(f"Invierte en la bolsa: {bolsa:.2f}")