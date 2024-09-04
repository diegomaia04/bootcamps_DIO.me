# tuplas!
##mais do mesmo, mesma coisa com listas, porem as tuplas são imutaveis

tupla = ("p","y","t","h","o","n", )

print(tupla.__len__)
print(tupla.index(1))

matriz = (
    (1, "a", 2),
    ("b", 3, 4),
    (6, 5, "c"),
)

print(matriz[0])  # (1, "a", 2)
print(matriz[0][0])  # 1
print(matriz[0][-1])  # 2
print(matriz[-1][-1])  # "c"

carros = (
    "gol",
    "celta",
    "palio",
)

for carro in carros:
    print(carro)


for indice, carro in enumerate(carros):
    print(f"{indice}: {carro}")

    cores = (
    "vermelho",
    "azul",
    "verde",
    "azul",
)

print(cores.count("vermelho"))  # 1
print(cores.count("azul"))  # 2
print(cores.count("verde"))  # 1



