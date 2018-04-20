"""
    Bernal Sánchez Diego Arturo
    Prebe 12
    17/03/18
    Programa aplanador de lista en Python 3.
"""

print(""" =================================================================================================
|Programa que aplana una lista, es decir, imprime los elemnto de listas anidadas en una sola lista|
 =================================================================================================
 """)

lista_anidada = [[1, 2, [4, 5, [6, 7, 8]]], 9, 0]
lista_aplanada = []

print("Lista original: ", lista_anidada)

def aplanador_lista(lista):
    for elemento in lista:
        if isinstance(elemento, list):
            aplanador_lista(elemento)
        else:
            lista_aplanada.append(elemento)


aplanador_lista(lista_anidada)

print("\nLista aplanada: ", lista_aplanada)
lista_ordenada = sorted(lista_aplanada)
print("\nLista aplanada y ordenada: ", lista_ordenada)
