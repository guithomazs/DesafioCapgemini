/*
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
*/

public class Ex02 {
    public static String UpperCase() {  // Criando o grupo de letras maiúsculas
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZ";  
    }

    public static String LowerCase() {  // Criando o grupo de letras minúsculas
        return "abcdefghijklmnopqrstuvwxyz";
    }

    public static String Digits() {  // Criando o grupo de dígitos
        return "0123456789";
    }

    public static String Especials() {  // Criando o grupo de caracteres especiais
        return "!@#$%^&*()-+";
    }

    public static boolean validar(String password, String valida) {
        for(char letra : password.toCharArray()) {  // mudando a senha para um vetor de caracteres, e percorrendo com um foreach
            if(valida.indexOf(letra) != -1){  // se a letra não satisfazer a condição, irá retornar -1 
                return true;  // a letra satisfez a condição, irá retornar True
            }
        }
        return false;  // em toda a senha nenhuma letra satisfez a condição, irá então retornar False
    }

    public static void main(String[] args) {
        System.out.print("Digite a senha: ");
        String senha = System.console().readLine();
        int diferenca_senha = 6 - senha.length();  // se a diferença < 0 então senha > 6, se diferença >= 0 então senha <= 6

        boolean tem_maiuscula = validar(senha, UpperCase()); // verifica se na senha há alguma maiuscula e retorna na variável
        boolean tem_minuscula = validar(senha, LowerCase()); // verifica se na senha há alguma minúscula e retorna na variável
        boolean tem_especial = validar(senha, Especials()); // verifica se na senha há algum caractere especial e retorna na variável
        boolean tem_digito = validar(senha, Digits()); // verifica se na senha há algum dígito e retorna na variável



        boolean[] condicoes = new boolean[4]; // criando e inserindo os valores True ou False dentro de um vetor
        condicoes[0] = tem_maiuscula;
        condicoes[1] = tem_minuscula;
        condicoes[2] = tem_especial;
        condicoes[3] = tem_digito;

        int mudancas = 0; // variável que irá contar o número de condições NÃO satisfeitas
        for (int i = 0; i < condicoes.length; i++) {  // percorrendo o grupo das condições que possui os valores booleanos armazenados
            if (condicoes[i] == false){  // se a condição estiver como False, irá aumentar o valor de mudanças em 1
                mudancas = mudancas + 1;
            } 
        }
        
        // se a diferença é positiva (senha < 6) e for maior que a quantidade de condições não satisfeitas, significa dizer que a diferença
        // é o próprio valor de mudanças mínimas necessárias para satisfazer todas as condições.
        if ((diferenca_senha > 0) & (diferenca_senha > mudancas)){
            System.out.println("Quantidade mínima de mudanças necessárias: "+diferenca_senha);
        // caso qualquer uma das condições de cima seja falso, o valor será inevitavelmente o próprio número de condições não satisfeitas na senha enviada.
        } else {
            System.out.println("Quantidade mínima de mudanças necessárias: "+mudancas);
        }
    }
}
