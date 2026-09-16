/* 
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem 
peso 5.
*/


package modulo01_fundamentos.exercicios_er_for;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, i;
        double A, B, C;
        double peso1 = 2, peso2 = 3, peso3 = 5;
        double media;

        System.out.print("Digite um valor inteiro: ");
        N = sc.nextInt();

        for(i=0; i<N; i++) {
            A = sc.nextDouble();
            B = sc.nextDouble();
            C = sc.nextDouble();
            

            media = (A * peso1 + B * peso2 + C * peso3)/(peso1 + peso2 + peso3);

            System.out.printf("%.1f%n", media);
        }
        sc.close();
    }
    
}
