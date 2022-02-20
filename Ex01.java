/*
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
*/
import java.util.Scanner;


public class Ex01 {
    
    public static String fazendo(String impresso, int vezes, int quantidade){
        
        int n_espacos = vezes - quantidade;   // definir o número de espaços para a string que irá completar
        String repeated = new String(new char[quantidade]).replace("\0", impresso);  // cria a string de asteriscos para imprimir
        String espacos = new String(new char[n_espacos]).replace("\0", " ");   // cria a string de espaços que irá concatenar para completar
        String result = espacos + repeated;   // adiciona a string de espaços a esquerda e concatena com a string de asteriscos a direita
        
        return result;  
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("N = ");
        int quantidade = scan.nextInt();
        scan.close();

        // repetirá o número de vezes que foi enviado anteriormente, e irá aumentar os asteriscos de cada linha conforme o valor de i
        for(int i = 1; i <= quantidade; i++){   
            System.out.println(fazendo("*", quantidade, i));
        }
    }
}
