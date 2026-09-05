// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa.

package modulo01_fundamentos.exercicios_lp;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, soma;

        System.out.println("Digite um número inteiro: ");
        a = sc.nextInt();
        System.out.println("Digite outro número inteiro: ");
        b = sc.nextInt();
        soma = a + b;
        System.out.println("A soma de " + a + " e " + b + " é : " + soma);

    sc.close();
    }
}
