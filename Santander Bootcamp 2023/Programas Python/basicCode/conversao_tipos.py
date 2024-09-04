#é possivel mudar os tipos de dados de uma variavles atrbuindo outros valores.

#INTEIRO PARA FLOAT
preco = 5
print(preco)

preco = float(preco)
print(preco)

#ou podemos fazer por outro jeito:

precoA = 10 / 2
print(precoA) 

#FLOAT PARA INTEIRO

quan = 10.30
print(quan)

quan = int(quan)
print(quan)

# fazendo a divisao de qualuqer numero com duas //, o resultado será inteiro

quant = 5
print(quant)

print(quant / 2 )
print(quant // 2 )


#NUMERICO PARA STRING
teste = 10.50
idade = 28

# o valor que foi voltado por que declaramos o valor acima e usamos o srt abaixo
print(str(teste))
print(str(idade))

texto = f"idade {idade} + preco{teste}"

# DE STRING PARA NUMERO

valor = 10.25
valor1 = 20

print(int(valor1))
print(float(valor))

# o "type" mostra qual o tipo de dado aqueela variavel é
print(type(valor))
print(type(valor1))




