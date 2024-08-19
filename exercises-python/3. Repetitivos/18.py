'''
18.Desarrolle los métodos ltrim(), rtrim(), alltrim().
'''
#ltrim()
def ltrim(a,b):
    if b in a:
        return a.replace(b,'')
    else:
        return "No se encuentra el segundo valor."

#rtrim()
def rtrim(a,b):
    if b in a:
        return a.replace(b,'')
    else:
        return "No se encuentra el segundo valor."

#alltrim()
def alltrim(a):
    return a.strip()



print(ltrim("Tabla Portatil","Portatil"))
print(rtrim("nxaxaxa","xa"))
print(alltrim("         H           "))

