'''
39.Desarrolle el programa para obtener el grado de eficiencia de un
operario de torno para obtener el grado de eficiencia de un operario
de torno de una fábrica productora de tornillos de acuerdo a las
siguientes condiciones: No más de 1.5 horas de ausencia al trabajo.
Menos de 300 tornillos defectuosos producidos. Más de 10000 tornillos
no defectuosos producidos. Los grados de eficiencia para cada trabajador
son asignados de la siguiente manera: Si no cumple ninguna condición,
grado 5. Si sólo cumple la primera, grado 7. Si sólo cumple la segunda,
grado 8. Si sólo cumple la tercera, grado 9. Si cumple la primera y segunda
condición, grado 12. Si cumple la primera y tercera condición, grado 13.
Si cumple la segunda y tercera condición, grado 15.
Si cumple las tres condiciones, grado 20.
'''
import os
os.system("cls")

horas = float(input("Horas de Ausencia: "))
torniDefec = int(input("Tornillos Defectuosos:"))
torniNoDefec = int(input("Tornillos No Defectuosos:"))

condicion1 = horas < 1.5
condicion2 = torniDefec < 300
condicion3 = torniNoDefec > 10000

if condicion1 == False and condicion2 == False and condicion3 == False:print("Grado 5")
elif condicion1 == True and condicion2 == False and condicion3 == False:print("Grado 7")
elif condicion1 == False and condicion2 == True and condicion3 == False:print("Grado 8")
elif condicion1 == False and condicion2 == False and condicion3 == True:print("Grado 9")
elif condicion1 == True and condicion2 == True and condicion3 == False:print("Grado 12")
elif condicion1 == True and condicion2 == False and condicion3 == True:print("Grado 13")
elif condicion1 == False and condicion2 == True and condicion3 == True:print("Grado 15")
elif condicion1 == True and condicion2 == True and condicion3 == True:print("Grado 20")
else: print("Ningun Grado.")