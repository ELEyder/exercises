import random

#Creado por Eyder Huayta para el proyecto de Cisco - 2020

print("#===================#")
print("       SUDOKU")
print("#===================#")
print("\nEste programa no es para jugar, solo fue hecho")
print("para visualizar un tablero ya completado de forma random.\n")
input("Pressiona cualquier tecla")
juego=True
def imprimir():
    sudoku=[[0,1,2,3,4,5,6,7,8],[3,4,5,6,7,8,0,1,2],[6,7,8,0,1,2,3,4,5],[1,2,3,4,5,6,7,8,0],[4,5,6,7,8,0,1,2,3],[7,8,0,1,2,3,4,5,6],[2,3,4,5,6,7,8,0,1],[5,6,7,8,0,1,2,3,4],[8,0,1,2,3,4,5,6,7]]
    contador = 0
    random_n = random.randint(1,9)
    for fila in sudoku:
        for n in fila:
            z = random_n
            new = n + z
            sudoku[sudoku.index(fila)][contador] = new
            contador += 1
        contador=0
    print("\n-------------------------------------------------------")
    for n in range(1,10):
        fila = sudoku[-(n)]
        for casilla in fila:
            if casilla > 9:
                casilla -= 9
            print("| ",casilla," ",end="")
        print("|\n-------------------------------------------------------")
imprimir()
while juego:
    elec=input("\n¿Quieres imprimir otro tablero? (s/n)\n")
    print()
    elec=elec.lower()
    if elec== "s":
        imprimir()
    elif elec == "n":
        juego=False
    else:
        print("No es una opción válida")

print("Fin")

#Perdon por no ser tan "random"
