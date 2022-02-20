"""
Exemplos:
ex 1:

Digite sua senha: kdsj3
Quantidade mínima de mudanças necessárias: 2
----------------------------------------------------
ex 2:

Digite sua senha: 53D
Quantidade mínima de mudanças necessárias: 3
----------------------------------------------------
ex 3:

Digite sua senha: Sd#3
Quantidade mínima de mudanças necessárias: 2
----------------------------------------------------
"""

from string import ascii_lowercase, ascii_uppercase, digits

especiais = '!@#$%^&*()-+'


def validar(password, valida):    # verifica se na senha enviada, existe alguma letra que satisfaça a condição que foi
    for letra in password:        # juntamente enviada no parâmetro valida
        if letra in valida:
            return True   # caso alguma satisfaça, retorna o valor True
    return False    # ao verificar todas e nenhuma satisfazer, retorna o valor False


senha = input('Digite sua senha: ')

diferenca_senha = 6 - len(senha)    # se a diferença < 0 então senha > 6, se diferença >= 0 então senha <= 6
tem_maiuscula = validar(senha, ascii_uppercase)   # verifica se na senha há alguma maiuscula e retorna na variável
tem_minuscula = validar(senha, ascii_lowercase)   # verifica se na senha há alguma minuscula e retorna na variável
tem_especial = validar(senha, especiais)   # verifica se na senha há algum caractere especial e retorna na variável
tem_digito = validar(senha, digits)   # verifica se na senha há algum digito e retorna na variável

condicoes = [
    tem_maiuscula, tem_minuscula, tem_especial, tem_digito   # grupo com os valores booleanos das variáveis
]

a_mudar = 0
for i in range(len(condicoes)):     # percorre no grupo verificando quantas condições NÃO foram satisfeitas
    if not condicoes[i]:
        a_mudar += 1

# se a diferença é positiva (senha < 6) e for maior que a quantidade de condições não satisfeitas, significa dizer que
# a diferença é o próprio valor de mudanças mínimas necessárias para satisfazer todas as condições.
if (diferenca_senha > 0) and (diferenca_senha > a_mudar):
    print("Quantidade mínima de mudanças necessárias:", diferenca_senha)

# caso qualquer uma das condições de cima seja falso, o valor será inevitavelmente o próprio número de condições não
# satisfeitas na senha enviada.
else:
    print("Quantidade mínima de mudanças necessárias:", a_mudar)
