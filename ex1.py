"""
Exemplos:
ex 1:

N = 6

saída:
     *
    **
   ***
  ****
 *****
******
----------------------------------------------------
ex 2:

N = 8

saída:
       *
      **
     ***
    ****
   *****
  ******
 *******
********
----------------------------------------------------

"""
qtd = int(input('N = '))

print()
print("Saída: ")
for i in range(1, qtd + 1):   # imprimirá em qtd linhas
    exibir = '*' * i        # cria uma string que aumenta em 1 o número de asteriscos conforme passa a linha para a prox
    print(exibir.rjust(qtd, ' '))   # numa string de tamanho "qtd" a string "exibir" será ajustada na margem a direita,
                                    # Completando a sua esquerda com o segundo parâmetro, no caso, os espaços

