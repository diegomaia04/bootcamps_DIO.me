saldo_atual = float(input('Digite o seu saldo Atual: '))
valor_deposito = float(input('Digite o valor que deseja depositar: 400'))
valor_retirada = float(input ('Digite o valor que deseja retirar: '))

#TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
valor_atualizado = (saldo_atual + valor_deposito) - valor_retirada

#TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
print(f'o valor atualizado é de:', valor_atualizado)

