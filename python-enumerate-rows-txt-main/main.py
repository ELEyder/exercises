import os
os.system("cls")

lista_vocales = ["a", "e", "i", "o", "u","A","E","I","O","U"]
#Definir la ruta del archivo
ruta = os.path.dirname(os.path.abspath(__file__)) + "\\texts\\"
archivo = open(ruta + "text.txt")

i=1
palabras = 0
total_palabras = 0
total_vocales = 0
vocales = 0
nuevo_texto = ""

#Leer lineas de archivo de texto linea por linea
for linea in archivo:
    nuevo_texto = nuevo_texto + ("%3d: %s" % (i,linea))
    linea = linea.rstrip("\n")
    #Obtener la longitud de la linea de texto
    longitud = len(linea)
    #Obtener cantidad de palabras
    for indice in range(longitud):
        caracter = linea[indice]
        if (caracter==" "):
            palabras = palabras + 1
        elif(caracter in lista_vocales):
            vocales = vocales + 1
            
    #Mostrar la linea en pantalla
    print("")
    print("%3d: %s" % (i,linea))
    print("")
    print("Longitud de caracteres : ", longitud)
    print("Cantidad de palabras : ", palabras)
    print("Cantidad de Vocales : ", vocales)
    total_palabras = total_palabras + palabras
    total_vocales = total_vocales + vocales
    #Incrementar el contador de lineas
    i+=1
    palabras = 0
    vocales = 0
print("-------------------------------------------------------------------------------------")
print("Total de lineas: ", i - 1)
print("Total de palabras del archivo: ", total_palabras)
print("Total de vocales del archivo: ", total_vocales)
print("-------------------------------------------------------------------------------------")
#Cerrar archivo de texto
archivo.close()

#Crear nuevo texto
archivo = open(ruta + "new-text.txt", 'w')
archivo.write(nuevo_texto)