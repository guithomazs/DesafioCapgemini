/*
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
*/
import java.util.Arrays;


public class Ex03 {

    public static String organizar(String palavra){
        char organizado[] = palavra.toCharArray();  // transforma a string recebida em um vetor de caracteres
        Arrays.sort(organizado);  // organiza em ordem alfabética esse vetor
        return new String(organizado);  // retorna o vetor novamente em forma de string
    }

    public static void main(String[] args) throws Exception {

        System.out.print("Entrada: ");
        String texto = System.console().readLine();
        int quantidade = 0;

        for(int qtd_letras = 1; qtd_letras < texto.length(); qtd_letras++){   // laço que define o número de letras da substring
            for(int i = 0; i < texto.length(); i++){   // laço para a variável da posição inicial da substring que irá ser comparada
                for(int j = i + 1; j < texto.length(); j++){  // laço para a variável da posição inicial da substring que irá comparar com a primeira
                    if((j + qtd_letras) <= texto.length()){  // para que não passe para uma posição inválida dentro do vetor

                        String corteA = texto.substring(i, i + qtd_letras);  // divide a substring do segundo laço for e coloca na variável
                        String corteb = texto.substring(j, j + qtd_letras);  // divide a substring do terceiro laço for e coloca na variável
                        String textA = organizar(corteA);  // usa a variável com o método organizar para colocar em ordem alfabética e retornar em outra variável
                        String textb = organizar(corteb);  // usa a variável com o método organizar para colocar em ordem alfabética e retornar em outra variável

                        if (textA.equals(textb)){  // se as duas organizadas forem iguais, é um anagrama, então acrescenta um na quantidade
                            quantidade += 1;
                        } 
                    }
                }
            }
        }
        System.out.print("Saída: ");
        System.out.println(quantidade);
    }
}
 