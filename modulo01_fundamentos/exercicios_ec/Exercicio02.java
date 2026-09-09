//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. 

package modulo01_fundamentos.exercicios_ec;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número inteiro: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("%d é um número par!", numero);
        }
        else {
            System.out.printf("%d é um número ímpar!", numero);
        }

        sc.close();
    }
}

// Um número é par quando dividido por 2 o resto é 0!