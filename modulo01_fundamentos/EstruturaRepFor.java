package modulo01_fundamentos;

import java.util.Scanner;

public class EstruturaRepFor {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int soma = 0;
        int i;


        System.out.print("Digite um número inteiro: ");
        n = sc.nextInt();

        for (i=0; i<n; i++) {
            System.out.println("Digite outro número inteiro: ");
            int x = sc.nextInt();
            soma += x;
        }
        System.out.println(soma);

        sc.close();

    }
}


// Usar quando se sabe previamente a quantidade de repetições ou o intervalo de valores.
// Ótima para fazer uma  repetição baseada em contagem (REGRESSIVA OU PROGRESSSIVA).
/* SINTAXE : for (início ; condição; incremento) {
                comando 1
                comando 2
        } */
/* O início é executado somente na primeira vez,
   A condição é verificada, se for verdadeira executa e volta, se for falsa encerra,
   O incremento executa toda vez depois de voltar.
*/
