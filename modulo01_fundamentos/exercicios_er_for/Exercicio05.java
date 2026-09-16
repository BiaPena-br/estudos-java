/* 
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. 
Lembrando que, por definição, fatorial de 0 é 1. 
*/

package modulo01_fundamentos.exercicios_er_for;

import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, i;
        int fat = 1;

        System.out.print("Digite um número inteiro: ");
        N = sc.nextInt();

        for(i=1; i<=N; i++) {
            fat *= i;
        }

        System.out.println(fat);


        sc.close();

    }
}
