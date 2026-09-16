/* 
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". 
*/

package modulo01_fundamentos.exercicios_er_for;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, i;
        double A, B;
        double divisao;

        System.out.print("Digite um número inteiro: ");
        N = sc.nextInt();

        for(i=0; i<N; i++) {
            A = sc.nextInt();
            B = sc.nextInt();

            if(B == 0) {
                System.out.println("Divisão impossível!");
            }
            else {
            divisao = A / B;

            System.out.printf("%.2f%n",divisao);
            }
        }

        sc.close();
    }
    
}
