/* 
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).  
*/


package modulo01_fundamentos.exercicios_lp;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, C, D, DIFERENCA;

        System.out.println("Digite o primeiro valor inteiro: ");
        A = sc.nextInt();
        System.out.println("Digite o segundo valor inteiro: ");
        B = sc.nextInt();
        System.out.println("Digite o terceiro valor inteiro: ");
        C = sc.nextInt();
        System.out.println("Digite o quarto valor inteiro: ");
        D = sc.nextInt();
        DIFERENCA = (A *B - C * D);
        System.out.println("Diferença = " + DIFERENCA);

        sc.close();
    }
    
}
