# Cria a lista com a sequência de Fibonacci, limitado aos 50 primeiros números
fibonacci = [0,1]
for i in range(1,49):
    fibonacci.append(fibonacci[i] + fibonacci[i-1])

# Método que verifica se o número está na lista
def verificarNumero(numero):
    if numero not in fibonacci:
        return False
    return True


nParaVerificar = 10;
print(verificarNumero(nParaVerificar))

#Pesca:
print('----------')
print('Número verificado: ', nParaVerificar)
print(f'Os {len(fibonacci)} primeiros números de fibonacci')
for i in range(0, len(fibonacci)):
    print(fibonacci[i], end=',')