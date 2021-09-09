#Tarea 2
#7/9-10/9
#JCRS


numero = [1 , 2 , 3 , 4, 5]

def Sumatoria(numero):

    if numero == []:
        return 0

    else:
        return numero [0] + Sumatoria(numero [1:])


print(Sumatoria(numero))
