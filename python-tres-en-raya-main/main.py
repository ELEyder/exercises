from random import choice

#Programa creado por Eyder Huayta para Cisco - 2020
print('¡Tres en raya! \n'.center(20))
input("Pulsa ENTER para continuar".center(20))
tablero= [[1,2,3],[4,"X",6],[7,8,9]]
lugares=[1,2,3,4,6,7,8,9]

def cambio(casilla , caracter):
    if casilla == 1: tablero[0][0] = caracter
    elif casilla == 2:tablero[0][1] = caracter
    elif casilla == 3:tablero[0][2] = caracter
    elif casilla == 4:tablero[1][0] = caracter
    elif casilla == 6:tablero[1][2] = caracter
    elif casilla == 7:tablero[2][0] = caracter
    elif casilla == 8:tablero[2][1] = caracter
    elif casilla == 9:tablero[2][2] = caracter
    lugares.remove(casilla)

def comprobarGanador():
    for fila in tablero:
        if fila[0] == fila[1] == fila[2] == "O":
            print("\nGanaste")
            return True
        elif fila[0] == fila[1] == fila[2] == "X":
            print("\nPerdiste")
            return True

    for fila in range(3):
        if tablero[0][fila] == tablero[1][fila] == tablero[2][fila] == "O":
            print("\nGanaste")
            return True
        elif tablero[0][fila] == tablero[1][fila] == tablero[2][fila] == "X":
            print("\nPerdiste")
            return True
    if tablero[0][0] == tablero [1][1] == tablero[2][2] == "O":
            print("\nGanaste")
            return True
    if tablero[0][2] == tablero [1][1] == tablero[2][0] == "O":
            print("\nGanaste")
            return True
    if tablero[0][0] == tablero [1][1] == tablero[2][2] == "X":
            print("\nPerdiste")
            return True
    if tablero[0][2] == tablero [1][1] == tablero[2][0] == "X":
            print("\nPerdiste")
            return True
    if lugares == []:
        print("\nEmpate")
        return True

def imprimir():
    global tablero
    for line in range(3):
        print("\n+ ------- + ------- + ------- +")
        print(end=" ")
        for i in tablero[line]:
            print(str(i).center(9), end=" ")
    print()
while True:
    imprimir()
    try:
        elec = int(input("\nIngresa tu movimiento:\n"))
    except:
        input("No es un número")
        continue
    cambio(elec, "O")
    imprimir()
    if comprobarGanador(): break
    random = choice(lugares)
    cambio(random, "X")
    imprimir()
    if comprobarGanador(): break      