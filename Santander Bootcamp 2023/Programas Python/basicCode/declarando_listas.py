# listas!

frutas = ["laranja", "maca", "uva"]
print(frutas)

print(frutas[0])
print(frutas[2])

frutas = []
print(frutas)

letras = list("python")
print(letras)

numeros = list(range(10))
print(numeros)

carro =  [ "Ferrari", "F8", 420000, 2020, 2900, " São Paulo", True]
print(carro)

lista = ["p","y","t","h","o","n",]

print(lista[2:])
print(lista[:2])
print(lista[1:3])
print(lista[0:3:2])
print(lista[::])
print(lista[::-1])

numeros_1 = [1,30,21,2,9,65,34]
pares = [numero for numero in numeros_1 if numero % 2 == 0] # verificar o numeros pares da lista
quadrado = [numero ** 2 for numero in numeros_1] # fazer todos os nuemros da lista  ao quadrado

print(quadrado)
print(pares)
print(" ")


# matriz

matriz = [
[1, 'a', 2],
[3, 'b', 4],
[5, 'c', 6]
]

#verificar posições dentro da matriz
print(matriz[0])
print(matriz[0][-1])
print(matriz[-1][-1])

# função append, se usa para adiconar coisas a lista, apenas um elemento consegue adiconar nesse funcao

lista_teste = []

lista_teste.append(1)
lista_teste.append("teste")
lista_teste.append([20, 50, 123])

print(lista_teste)

# função clear, limpa todas as informações contidas na lista

lista_1 = [8,6,87,89,898,00]
print(lista_1)
lista_1.clear()
print(lista_1)

# funçao copy, copia os elemntos da lista indicada

lista_1 = [8,6,87,89,898,00]
l2 = lista_1.copy()
l2.append(10)
print(l2)

# funcao count, conta quantso elementos espesificos em uma olsita

l10 = [10,15,14,10,90,15,30,15,10,2,4,6,7,2,4,6,8]
print(l10.count(10))
print(l10.count(2))
print(l10.count(7))

#funcao extend, funcao qeu adiciona um ou mais elementos que quiser um lista existete

l3 = ['ps1', 'ps2', 'ps3']
print(l3)
l3.extend('PS4')
print(l3)

# funcao index, para descobrir qual a posição que etsa certo obejto

l3.index('ps1')
print(l3.index('ps1'))
l3.index('P')
print(l3.index('P'))

# funcao pop, nao entendi mas acho que e para selecionar um obejto do fim ao inicio
print(l3.pop)

# remove, bomm esta na cara ne
print(l3)
l3.remove('P')
print(l3)

#reverse, fazer o espelhamento da lista seleciona
print(l3)
l3.reverse()
print(l3)
print(" ")

#sort, ordena a lista desejada de maneira alfebetica, porem com argumentos da para afzer outras coisas nele, segue exemlos

linguagens = ["Taylor Swift", "Fearless", " Speak Now", "Red", "Reputation", "Lover", "Folklore", "Evermore", "Midnights"]

print(linguagens)

# ordem alfabetica
linguagens.sort()
print(linguagens)

#ordem alfabetica inversa
linguagens.sort(reverse=True)
print(linguagens)

# ordem do tamnaho das palavras, nuemros de caracteres
linguagens.sort(key = lambda x: len(x))
print(linguagens)

# len, tamanho de objetos da lista desejada
print(len(linguagens))

#sorted, mesma coisa do sort mas aqui é uma função

sorted(linguagens, key=lambda x: len(x))
print(linguagens)
sorted(linguagens, key=lambda x: len(x), reverse=True)
print(linguagens)