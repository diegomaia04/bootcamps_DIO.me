# declarando dicionarios no python

# o formato para criar um dicionario e as ifnormações entre chaves
# dicinario cirado e possivel acessar por completo o dicinario
pessoa = {
         "p1": {"nome": "diego", "idade": 19},
         "p2": {"nome": "taylor", "idade": 33}
}
print(pessoa)

# outro jeito de fazer dicionarioss
teste = dict(nome= "anakin", idade= 1)
print(teste)

#adiconar informações a um dicionairo
pessoa["telefone"] = "11234567898"
print(pessoa)

p = {"a": 1234}
print(p)
p = dict()
print(p)

# dicinarrios aninhados:

contatos = {
    "Mestre": {"nome": "Yoda", "Cor do Sabre": "verde", "ano": "1977"},
    "Cavaleiro": {"nome": "Obi Wan", "Cor do Sabre": "azul", "ano": "1977"},
    "Padawan": {"nome": "Anakin", "Cor do Sabre": "azul", "ano": "2001","Sith": {"nome": "Darth Vader", "Cor do Sabre": "Vermelho"} },
    "Droide": {"nome": "R2-D2", "Cor do Sabre": "N/A", "ano": "1977"}
}

#acessando dados dde dentro dos dicionarios
Cor = contatos["Mestre"]["Cor do Sabre"]
print(Cor)

Rank = contatos["Padawan"]["nome"]
print(Rank)

#acessando dicionarios dentro de outros dicionarios
exibir = contatos["Padawan"]["Sith"]
print(exibir)

exibir1 = contatos["Padawan"]["Sith"]["nome"]
print(exibir1)


# jeito de perccorrer um dicionairo por completo usando for

for chave in contatos:
    print(chave, contatos[chave])
  
# meteodos do dicinario em python
# clear, usando para limpar infoemações dentro de um dicioanrjo 

print(pessoa)
pessoa.clear()
print(pessoa)

# copy, copia uma infromação do dicionario, ver exemplos:

contato = {
    "diego": {"sobrenome": "Maia", "telefone": "1140029852"}
}

contato.copy()
copia = contato.copy()
copia["diego"] = {"sobrenome":"Fernandes"}

print(contato["diego"])
print(copia["diego"])

# criar cahves no seu dicionario, mas não passar nenhum valor

dict.fromkeys(["nome", "celular"], "vazio")
novo = dict.fromkeys(["nome", "celular"], "vazio")
print(novo)

# get, usando para acessar valores dentro de um dicionario

contatos.get("Mestre", {})
get = contatos.get("Mestre", {})
print(get)

contatos.get("Padawan", {})
get = contatos.get("Padawan", {})
print(get)

# items, para bsucar os itens do dicionario

contatos.items()
buscar = contatos.items()
print(buscar)

# keys, ele retorna so as cahves do dicionario

contatos.keys()
resultado = contatos.keys()
print(resultado)

# pop, ele vai remover uma chave do seu dicionario

contato.pop
remover = contato.pop("diego")
print(remover)

remover = contato.pop("diego", "não o dicionario")
print(remover)

# setdefault

lista = {"artista": {'nome': 'taylor swift', 'idade': '33'},
         "artista2": {'nome': 'lana del Rey', 'idade': '45'}
         }

lista.setdefault("nome", "Lana del Rey")
add = lista.setdefault("nome", "Lana del Rey")


lista.setdefault("profissão", "Cantora")
add = lista.setdefault("profissão", "Cantora")

# update, alterar algo dentro de um dicionario

lista.update({"artista2":{"nome": "Lana del Rey, a maior"}})
print(lista)

lista.update({"artista":{'nome': 'taylor swift'}})
print(lista)

# values, ver todos os valores dentro de um dicionario

exibir_valor = contatos.values()
print(exibir_valor)

# in, verificar se algum valor esta dentro de um dicionario

agenda = {
    "guilherme@gmail.com": {"nome": "Guilherme", "telefone": "3333-2221"},
    "giovanna@gmail.com": {"nome": "Giovanna", "telefone": "3443-2121"},
    "chappie@gmail.com": {"nome": "Chappie", "telefone": "3344-9871"},
    "melaine@gmail.com": {"nome": "Melaine", "telefone": "3333-7766"},
}

resultado = "guilherme@gmail.com" in agenda  # True
print(resultado)

resultado = "megui@gmail.com" in agenda  # False
print(resultado)

resultado = "idade" in agenda["guilherme@gmail.com"]  # False
print(resultado)

resultado = "telefone" in agenda["giovanna@gmail.com"]  # True
print(resultado)

# DEL, FAZER DEPOIS!