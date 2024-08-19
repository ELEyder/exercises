'''
19.Diseñe el programa que muestre 10 botones alineados verticalmente.
'''
from tkinter import *

ventana = Tk()
ventana.geometry("200x300")
Button(ventana,text="Botón 1.").pack()
Button(ventana,text="Botón 2.").pack()
Button(ventana,text="Botón 3.").pack()
Button(ventana,text="Botón 4.").pack()
Button(ventana,text="Botón 5.").pack()
Button(ventana,text="Botón 6.").pack()
Button(ventana,text="Botón 7.").pack()
Button(ventana,text="Botón 8.").pack()
Button(ventana,text="Botón 9.").pack()
Button(ventana,text="Botón 10.").pack()

ventana.mainloop()