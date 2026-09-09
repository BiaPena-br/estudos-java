// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.


package modulo01_fundamentos.exercicios_ec;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número inteiro: ");
        numero = sc.nextInt();

        if (numero > 0) {
            System.out.printf("%d é um número positivo!", numero);
        }
        else {
            System.out.printf("%d é um número negativo!", numero);
        }

        sc.close();

    }
}