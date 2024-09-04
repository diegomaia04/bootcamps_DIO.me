# ESTRUTURA CONDICIONAL

#if

saldo = 2000
saque = float(input("Informe o valor do saque: "))

if saldo >= saque:
    print("Realizando saque!")

if saldo < saque:
    print("Saldo insuficiente!")


saldo_1= 2000
saque_1 = float(input("Informe o valor do seu saque: "))

# if / else

if saldo_1>= saque_1:
     print("Realizando saque!")
else:
    print("Saldo insuficiente!")

# if/ elif/ else

opcao = int(input("Informe uma opção: \n[1] Sacar \n[2] Extrato: "))

if opcao == 1:
    valor = float(input("Informe o valor do seu saque: "))
elif opcao == 2: 
    print("exibindo o extrato...")
else:
   print("Opcção inválida")

MAIOR_IDADE = 18
IDADE_ESPECIAL = 17

idade = int(input("informe sua idade: "))

if idade >= MAIOR_IDADE:
    print("maior de idade, pode tirar a cnh")
elif idade == IDADE_ESPECIAL:
     print("pode apenas realizar a parte teorica")
else:
    print("não pode tirar a cnh.")

# if aninhada

conta_normal = True
conta_universitaria = False

saldo_2 = 2000
saque_2 = 500
cheque_especial = 450

if conta_normal:
    if saldo_2 >= saque:
        print("Saque realizado com sucesso!")
    elif saque <= (saldo_2 + cheque_especial):
        print("Saque realiazdo com uso do cheque especial")
    else:
        print("não foi possivel realizar o saque, saldo insuficiente")
elif conta_universitaria:
    if saldo >= saque:
        print("Saque realizado com sucesso!")
    else:
        print("Saldo insuficiente!") 

else:
    print("Sistema não reconheceu seu tipo de conta, entre em conatto com o gerente")               


# if ternário

saque_3 = 2500
saldo_3 = 2500

status = "Sucesso" if saldo >= saque else "falha"
print(f"{status} ao realizar o saque")