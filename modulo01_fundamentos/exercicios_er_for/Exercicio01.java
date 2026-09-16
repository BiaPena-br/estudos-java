/* 
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o 
X, se for o caso. 
*/

package modulo01_fundamentos.exercicios_er_for;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, i;

        System.out.print("Digite um número inteiro de 1 até 1000: ");
        x = sc.nextInt();

        for(i=1; i<=x; i+= 2) {
            System.out.printf("%n%d", i);
        }

        sc.close();
    }
}

// Quando soubre que tem que começar em 1 e ir colocando os ímpares, só fazer o i somar 2 a partir do 1.