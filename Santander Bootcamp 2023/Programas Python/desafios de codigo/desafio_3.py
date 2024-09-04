# Entrada de dados
saldo_total = int(input())
valor_saque = int(input())

# TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
a = saldo = saldo_total - valor_saque
print(saldo)

if saldo_total < valor_saque:
    print("não foi possivel realizar o saque")
else:
    print("Saque realizado com sucesso! Novo saldo:" , saldo)