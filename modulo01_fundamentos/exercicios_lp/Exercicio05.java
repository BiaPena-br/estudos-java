/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
*/

package modulo01_fundamentos.exercicios_lp;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio05 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codPeca1, numPeca1, codPeca2, numPeca2;
        double valPeca1, valPeca2, total;

        System.out.println("Digite o código da peça 1: ");
        codPeca1 = sc.nextInt();
        System.out.println("Digite o número de peças 1: ");
        numPeca1 = sc.nextInt();
        System.out.println("Digite o valor da peça 1:");
        valPeca1 = sc.nextDouble();
        System.out.println("Digite o código da peça 2: ");
        codPeca2 = sc.nextInt();
        System.out.println("Digite o número de peças 2: ");
        numPeca2 = sc.nextInt();
        System.out.println("Digite o valor da peça 2:");
        valPeca2 = sc.nextDouble();

        total = (numPeca1 * valPeca1) + (numPeca2 * valPeca2);
        System.out.printf("O valor total a ser pago é: R$ %.2f%n", total);

        sc.close();
    }
}
