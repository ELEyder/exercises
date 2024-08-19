'''
37.En una elección democrática a la presidencia de un club
femenino participan Pamela, Carol y Fanny. Para ganar la elección
se requiere obtener la mitad de los votos emitidos más uno. En caso
de no haber ganador, pasan a una segunda vuelta los candidatos que
alcanzaron los dos primeros puestos; se anula la elección si hay empate
entre los tres o si hay empate por el segundo puesto. Desarrolle el programa
que muestre en que puesto quedaron los candidatos.
'''
import os
import operator
os.system("cls")

pamela = int(input("Pamela: "))
carol = int(input("Carol: "))
fanny = int(input("Fanny: "))

listaOrden = sorted([pamela,carol,fanny])
total = pamela + carol + fanny

dic = {"Pamela":pamela,"Carol":carol,"Fanny":fanny}
ordenNombres = dict(sorted(dic.items(), key=operator.itemgetter(1)))
list_of_key = list(ordenNombres.keys())

if listaOrden[0] == listaOrden[1] == listaOrden[2] or listaOrden[0] == listaOrden[1]:
    print("Elecciones Anuladas")
else:
    if (total / 2 + 1) <= listaOrden[2]:
        print(f"Puesto 1: {list_of_key[2]}")
        print(f"Puesto 2: {list_of_key[1]}")
        print(f"Puesto 3: {list_of_key[0]}")
    else:
        print(f"Pasan a segunda vuelta {list_of_key[2]} y {list_of_key[1]}")

