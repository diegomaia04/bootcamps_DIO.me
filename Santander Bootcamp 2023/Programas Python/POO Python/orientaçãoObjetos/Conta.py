class Conta:
    def __init__(self, titular, numero, saldo):
        self.titular = titular
        self.saldo = 0
        self.numero = numero
        
        
    def saque(self, valor):
         if (self.saldo >= valor):
             self.saldo -= valor
             print(" saque realizado com sucesso")
         else:
             print("saldo insuciente")
        
    @property
    def saldo(self):
        return self._saldo
    
    @saldo.setter
    def saldo(self, saldo):
        if (saldo < 0):
            print(" O saldo não pode negativo")
        else:
            self._saldo = saldo
            
    def deposita(self, valor):
        self.saldo += valor
        
    def extrato(self):
        print("CLiente: ", self.titular, "Saldo Atual: ", self.saldo)
            
     
                
    