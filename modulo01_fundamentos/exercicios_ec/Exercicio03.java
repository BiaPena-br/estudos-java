/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
ordem crescente ou decrescente.  */



package modulo01_fundamentos.exercicios_ec;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B;

        System.out.print("Digite um número inteiro: ");
        A = sc.nextInt();
        System.out.print("Digite outro número inteiro: ");
        B = sc.nextInt();

        if (A % B == 0) {
            System.out.printf("%d e %d são múltiplos entre si!", A, B);
        }
        else {
            System.out.printf("%d e %d não são múltiplos entre si!", A, B);
        }

        sc.close();
    }
}

// Números múltiplos são números que podem ser divididos sem deixar resto (0)!