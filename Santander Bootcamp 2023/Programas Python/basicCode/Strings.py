# Conhecendo meteodos uteis da classe string - etapa 1

#maisucla, minuscula e titulo

nome = "aNaKin"

print(nome)
print(nome.upper())
print(nome.lower())
print(nome.title())

#elinimando espaçoes en branco

texto = "  Olá Mundo  "

print(texto + ".")
print(texto.strip() + ".")
print(texto.rstrip() + ".")
print(texto.lstrip() + ".")

# junções e centrilazação

menu = "Java"

print(menu)
print(menu.center(14))
print(menu.center(14, "!"))
print("J-a-v-a")
print("-".join(menu))

for letra in menu:
    print(letra, end="-")
    print(" ")

# interpolação de variaveis - etapa 2

name = "Diego"
idade = 19
profissao = "estudante"
linguagem = "Python"
saldo = 45.953

dados = {"nome": "diego", "idade": 19}

print("1- Nome: %s Idade: %d" %(name, idade))
print(" ")
print("2- Nome: {} Idade {}".format(name, idade))
print("3- Nome: {0} Idade {1}".format(name, idade))
print("4- Nome: {0} Idade {1} Nome {1}" .format(name, idade))
print(" ")
print("5- Nome: {nam} Idade {idad}" .format(nam = name, idad = idade))
print("6- Nome: {nam} {nam} Idade {idad}" .format(nam = name, idad = idade))
print("7- Nome: {nome} Idade {idade}" .format(**dados))
print(" ")
print(f"8- Nome: {name} Idade: {idade}")
print(f"9- Nome: {name} Idade: {idade} Saldo: {saldo:10.2f}")
print(f"10- Nome: {name} Idade: {idade} Saldo: {saldo:.2f}")

# fatiamento de String - etapa 3

nome_completo = "Diego Maia Fernandes"

print(nome_completo[0])
print(nome_completo[-2])
print(nome_completo[:9])
print(nome_completo[::-1])

# String de multiplas linhas - etapa 4

nome_1 = "diego"

mensagem = f"""
      Olá, meu nome é {nome_1}
Eu estou apredendo Python
    Essa mensageem tem diferentes recuos
    """





