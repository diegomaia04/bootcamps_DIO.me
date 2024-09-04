# existem dois jeitos de declarar variavies no python, linha por linha como no exeplo a seguir

age = 18
name = 'Diego'
print(f'Meu nome é {name} e eu tenho {age} anos(s) de idade')

# ou delara todas as variaveis em ma so linha de comando#
#se nota que pode declarar mais de um valor na variavel, ela mudara conforme você foe editando

anos, nome = (19, 'Maia')
nome = 'diego'
print(f'Meu nome é {nome} e eu tenho {anos} anos(s) de idade')

limite_saque_diario = 1000
#limiteSaqueDiario = 1000 <<< não se utiliza#
print(limite_saque_diario)

#Constantes smepre são escritas com todas as letras maiusculas!#

AMOUNT = 30.2
STATES = [
    'SP', 
    'RJ',
    'MG'
       
       ]
DEBUG = True
print(STATES, AMOUNT, DEBUG)
