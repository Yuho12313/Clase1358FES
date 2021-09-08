#Tarea 2.3, eliminar la parte media de una cadena y si la cadena es par quitar la parte previa al medio
#7/9-10/9
#JCRS

x = input("Dame tu lista o arreglo: ")

y = len(x)
print(f" {y} numero de caracteres")

if y % 2 == 0:

    mitadn = (y/2) - 1
    mitadp = (y/2)

    a = x[:int(mitadn)]
    b = x[ int(mitadp):]

    print(f" {a + b} ")

else:

    smtadn = (y/2)
    smtadp = (y/2) + 1

    ab = x[:int(smtadn)]
    bc = x[int(smtadp):]

    print(f" {ab + bc} ")


