/* 
Ler um número inteiro N e calcular todos os seus divisores.
*/

package modulo01_fundamentos.exercicios_er_for;

import java.util.Scanner;

public class Exercicio06 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, i, divisores;

        System.out.print("Digite um número inteiro: ");
        N = sc.nextInt();

        for(i=1; i<=N; i++) {
            divisores = N % i;
            if (divisores == 0) {
                System.err.println(i);
            }
        }

        sc.close();
    }
}
