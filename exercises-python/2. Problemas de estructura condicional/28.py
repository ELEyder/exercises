'''
28.Desarrolle el programa que, ingresado una hora en formato de 24 horas, 
la muestre en formato de 12 horas am / pm. Además, si la hora es inválida
mostrar el mensaje de error respectivo.
'''

import os
os.system("cls")

tiempo = input("Hora (hh:mm): ")
final = "am"
acceso = 1
print()
#12:12

if len(tiempo) > 5:
    print("Hora Incorrecta.")
else:
    try:
        hora = int(tiempo[0:2])
        try:
            minuto = int(tiempo[3:5])
        except:
            print("Ingresa bien los minutos.")
            acceso = 0
    except:
        acceso = 0
        print("Ingresa correctamente la hora")
        if tiempo[1] == ":":
            print(f'Prueba colocando "0{tiempo[0]}" en vez de {tiempo[0]}')
        print()

    if tiempo[2] != ":":
        if tiempo [1] == ":":
            pass
        elif ":" in tiempo:
            print(f'Usa los ":" en vez de "{tiempo[2]}" para separar la hora')
            acceso = 0
            print()
    elif acceso == 1:
        if hora > 24:
            print("La hora supera las 24 horas.")
        elif hora < 0:
            print("Hora inválida, hora negativa")
        elif 24 > hora > 11:
            if minuto > 59:
                print("El minuto supera los 60 minutos. Conviértalos a horas.")
            else:
                hora -= 12
                final = "pm"
                if hora < 10:
                    hora = "0" + str(hora)
                if minuto < 10:
                    minuto = "0" + str(minuto)
                print(f"{hora}:{minuto} {final}")
        elif len(str(minuto)) == 1:
            minuto = "0" + str(minuto)

            if len(tiempo) == 5:
                print(f"{hora}:{minuto}")
            elif len(tiempo) == 4 and tiempo[1] == ":":
                print(f"0{hora}:{minuto} {final}")
            else:
                print(f"{hora}:{minuto} {final}")
        
        elif minuto > 59:
            print("Minuto incorrecto..")
            
        else:
            print(f"{hora}:{minuto} {final}")