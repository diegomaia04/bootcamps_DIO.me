#sets, não retorna valores duplicaods na lista

teste = set([1,1,2,4,8,4,3,3,6,7,9,7,9])
print(teste)

teste_1 = set("arara")
print(teste_1)

teste_2 = set(("gol", "palio", "gol","palio", "gol"))
print(teste_2)

#a lista entre {} serve igual ao set, não repete iformações
albuns = {"born to die","born to die", 1989, 1989, "red", 1989 }
print(albuns)

for album in albuns:

    print(album)

for indice, album in enumerate(albuns):
    print(f"{indice}: {album}")
# ttranformando conjutos sets em listas para acessar os valores

numeros = {1,2,3,3,2,1}

numeros = list(numeros)
print(numeros[0])

# comando unio, usando para unir conjutos!

conjunto_a = {1,2}
conjunto_b = {3,4}

conjunto_a.union(conjunto_b)
print(conjunto_a.union(conjunto_b))

# comando intersection, usando para encontrar obejtnso identicos em dois conjutos

cj = {1,2,3,4,5}
cj_1 = {4,5,6,7,8}

cj.intersection(cj_1)
print(cj.intersection(cj_1))

# comando difference, tudo que existe de diferentes entre os conjutnso

cj.difference(cj_1)
print(cj.difference(cj_1))
cj_1.difference(cj)
print(cj_1.difference(cj))

#summetric_diferrec, todos os elmentos que não estão se conectando

cj.symmetric_difference
print(cj.symmetric_difference(cj_1))
cj_1.symmetric_difference
print(cj_1.symmetric_difference(cj))

# issubet, verificar sse um conjuto esta dentro do outro 

cj.issubset(cj_1)
print(cj.issubset(cj_1))
cj_1.issubset(cj)
print(cj_1.issubset(cj))

#isdisjoint, comando para verificar se um conjutno esta fora do outro

a = cj.isdisjoint(cj_1)
print(a)
b = cj_1.isdisjoint(cj)
print(b)

# add, comando para bom voce ja sabe ne

sorteio = {1,23}

sorteio.add(13)
sorteio.add(1)
sorteio.add(26)
print(sorteio)

#discard, descartar ou remover algumm valor de um conjunto

sorteio.discard(26)
sorteio.discard(23)
print(sorteio)

#pop, esse comando remove um valor a partir do inicio da olista

sim = {1,2,3,4,5,6,7,8,9,10}

print(sim)
print(sim.pop())
print(sim.pop())
print(sim.pop())
print(sim.pop())
print(sim)

#remove, remover um elmento dentro do conjunto

sim.remove(9)
sim.remove(10)
print(sim)

#len, o tamanho dos elemntos dentro do conjunto, ele nao conta itens rpetidos

len(sim)
print(len(sim))

#in, veririfcar se algum elemento pertence a algum conunto

p = 1 in sim
print(p)
e = 8 in sim
print(e)
