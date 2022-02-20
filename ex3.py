"""
Exemplos:
ex 1:

Entrada:ifailuhkqq
Saída: 3
----------------------------------------------------
ex 2:

Entrada:teste
Saída: 6
----------------------------------------------------
ex 3:

Entrada:lkjwaiudshkjla
Saída: 12
----------------------------------------------------
"""

texto = input("Entrada:")
quantidade = 0
for qtd in range(1, len(texto)):     # for que serve para definir a quantidade de letras da substring
    for i in range(len(texto)):      # substring que irá ser comparada com as outras porções do texto
        for j in range(i + 1, len(texto)):       # substrings de comparação
            if sorted(texto[i:i + qtd]) == sorted(texto[j:j + qtd]):
                quantidade += 1       # variável para contabilizar o número de anagramas internos

print('Saída:', quantidade)
























