class Main:
   ##  A classe Main não possui atributos.Utilizamos apenas a palavra reservada pass.
    pass

from Cliente import Cliente
from Conta import Conta

## Após criarmos a referência da classe, adicionamos, na linha seguinte, o novo objeto, passando por parâmetro os valores para inicialização dos atributos.
c1 = Cliente("Diego", "11 953336542")
conta = Conta(c1.nome, 1000, 1000)

print(c1)
print(c1.nome," e ", c1.telefone)
print(conta.titular, " Numero ", conta.numero, " Seu saldo", conta.saldo)

print("___________________________________________________________________")

conta.deposita(100)
conta.saque(50)
conta.extrato