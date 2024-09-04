# funções do python, a palavra reservada é o def

def exibir_mensagem():
    print("Olá Mundo!")

def exibir_mensagem_2(nome):
    print(f"Seja bem vindo {nome}!")

def exibir_mensagem_3(nome = "Anônimo"):
    print(f"Seja bem vindo  {nome}!")

exibir_mensagem()
exibir_mensagem_2(nome = "Diego")
exibir_mensagem_3()
exibir_mensagem_3(nome="Chappie")

# retrono de valores

def calcular_total(numeros):
    return sum(numeros)

def retorna_antecessor_e_sucessor(numero):
    antecessor = numero - 1
    sucessor = numero + 1

    return antecessor, sucessor


calcular_total([10,20,100])
retorna_antecessor_e_sucessor(0)
print(calcular_total([10,20,100]))
print(retorna_antecessor_e_sucessor(0))

# arguemtos que chama funções:

def salvar_carro(marca, modelo, ano, placa):
    print(f"Carro inserido com sucesso! marca: {marca}/ modelo: {modelo}/ ano: {ano} e placa: {placa}")


salvar_carro("fiat", "palio", 1999, "ABC=1234")
salvar_carro(marca="Honda", modelo="4x4", ano = 2017, placa="STTROS")
salvar_carro(**{"marca": "Fiat", "modelo": "Palio", "ano": 1999, "placa": "ABC-1234"})
print("")

def exibir_poema(data_extenso, *args, **kwargs):
    texto = "\n".join(args)
    meta_dados = "\n".join([f"{chave.title()}: {valor}" for chave, valor in kwargs.items()])
    mensagem = f"{data_extenso}\n\n{texto}\n\n{meta_dados}"
    print(mensagem)


exibir_poema(
    "Zen of Python",
    "Beautiful is better than ugly.",
    "Explicit is better than implicit.",
    "Simple is better than complex.",
    "Complex is better than complicated.",
    "Flat is better than nested.",
    "Sparse is better than dense.",
    "Readability counts.",
    "Special cases aren't special enough to break the rules.",
    "Although practicality beats purity.",
    "Errors should never pass silently.",
    "Unless explicitly silenced.",
    "In the face of ambiguity, refuse the temptation to guess.",
    "There should be one-- and preferably only one --obvious way to do it.",
    "Although that way may not be obvious at first unless you're Dutch.",
    "Now is better than never.",
    "Although never is often better than *right* now.",
    "If the implementation is hard to explain, it's a bad idea.",
    "If the implementation is easy to explain, it may be a good idea.",
    "Namespaces are one honking great idea -- let's do more of those!",
    autor="Tim Peters",
    ano=1999,
)

# apenas por posição 
# o que vem antes da barra é obrigatorio passar por posição e não por nome, o que vem depois da barra e opcional


def criar_carro(modelo, ano, placa, /, marca, motor, combustivel):
    print(modelo, ano, placa, marca, motor, combustivel)


criar_carro("Palio", 1999, "ABC-1234", marca="Fiat", motor="1.0", combustivel="Gasolina")
# criar_carro(modelo="Palio", ano=1999, placa="ABC-1234", marca="Fiat", motor="1.0", combustivel="Gasolina")  # inválido

# keyword only
# quando existir o * é obrigatorio passar todos por nome exemplo:

def criar_carros(*, modelo, ano, placa, marca, motor, combustivel):
    print(modelo, ano, placa, marca, motor, combustivel)

criar_carros(modelo="Palio", ano=1999, placa="ABC-1234", marca="Fiat", motor="1.0", combustivel="Gasolina")  # válido, o codigo vai funcionar
# criar_carro("Palio", 1999, "ABC-1234", marca="Fiat", motor="1.0", combustivel="Gasolina") # invalido o codigo n vai funcionar

# obejto de priemira classe, usando um funçaõ em outra função
def somar(a, b):
    return a + b

def subatrair(a,b):
    return a - b

def test(a,b):
    return (a**2) + (b**2)


def exibir_resultado(a, b, funcao):
    resultado = funcao(a, b)
    print(f"O resultado da operação é = {resultado}")


exibir_resultado(10, 10, somar)  # O resultado da operação 10 + 10 = 20
exibir_resultado(10, 10, subatrair)  # O resultado da operação 10 - 10 = 0
exibir_resultado(3, 3, test)  # O resultado da operação 3 ao quadrado + 3 ao quadrado

# escopo global e local
# a segui o slaario e uma variavel global poois esta fora da função

salario = 2000

def salario_bonus(bonus):
    global salario
    salario += bonus
    return salario

salario_bonus(500)
print(salario_bonus)