# operadores aritimeticos

print(5+4)
print(8-9)
print(12*78)
print(1416/3)
print(10+5-4)
print ( 2 ** 8)

produto_1 = 10
produto_2 = 20

print(produto_1 + produto_2 + 1) 
print(produto_1 / produto_2) 
print(produto_1 // produto_2)
print(produto_2 % produto_1)  
print(produto_1 ** produto_2)

x = ((10 * 5) + produto_1)
print(x)

y = x // 10
print(y)

#operadores de comparação

saldo = 450
saque = 200

print(saldo == saque ) # saldo é igual ao saque
print(saldo != saque ) # saldo é diferente de saque
print(saldo > saque ) # saldo é maior que saque
print(saldo < saque ) # saldo é menor que saque
print(saldo >= saque ) # saldo é maiior ou igual ao saque
print(saldo <= saque )  # saldo é menor ou igual ao saldo

# opeadores de atribuição
#atribuir um valor a alguma variavel
#é possivel sobrescrever ou adicionar uma variavel já criada

saldo_1 = 500
print(saldo_1)

saldo_1 += 500
print(saldo_1)

saldo_1 -= 500
print(saldo_1)

saldo_1 *= 2
print(saldo_1)

saldo_1 /= 10
print(saldo_1)

saldo_1 **= 0
print(saldo_1);

#operadores logicos

# AND - para ser True tudo tem que ser True
# OR - para ser True apenas um tem que ser True

# para modicar o resultado final, voc~e podera adiconar mais TRUE or False nas questões seguintes
print(True and True)
print(True and False)
print(False and False)
print(True or True)
print(True or False)
print(False or False)

saldo = 1000
saque = 250
limite = 200
conta_especial = True

exp = saldo >= saque and saque <= limite or conta_especial and saldo >= saque
print(exp)

exp_2 = saldo >= saque and saque <= limite or conta_especial and saldo >= saque
print(exp_2)

conta_normal_com_saldo_suficiente = saldo >= saque and saque <+ limite
conta_especial_com_saldo_suciente = conta_especial and saldo >= saque

exp_3 = conta_normal_com_saldo_suficiente or conta_especial_com_saldo_suciente
print(exp_3)

# operadores de indetidade
# ver se uma variavel, constante ou obejto ocupa o mesmo lugar de memoria

saldo_teste = 1000
saque_teste = 1000

print(saldo_teste is saque_teste)
print(saldo_teste is not saque_teste)

# operadores de associação

curso = 'Python'
frutas = ['maçã', 'banana', 'melão']
banco = [100, 200, 300]

print('Python' in curso)
print(100 in frutas)
print(100 in banco)
print('Python' not in banco)