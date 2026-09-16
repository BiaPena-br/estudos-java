/* 
Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme 
exemplo. 
*/

package modulo01_fundamentos.exercicios_er_for;

import java.util.Scanner;

public class Exercicio07 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, i, quadrado, cubo;

        System.out.print("Digite um número inteiro e positivo: ");
        N = sc.nextInt();

        for(i=1; i<=N; i++) {
            quadrado = (int) Math.pow(i, 2);
            cubo = (int) Math.pow(i, 3);
            System.out.printf("%d %d %d%n", i, quadrado, cubo);
        }

        sc.close();
    }
}
