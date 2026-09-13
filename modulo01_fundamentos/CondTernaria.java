package modulo01_fundamentos;

import java.util.Scanner;

public class CondTernaria {
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double produto, desconto, precoFinal;

        System.out.print("Qual valor do produto? ");
        produto = sc.nextDouble();

        desconto = (produto > 100.00) ? produto * 0.10 : produto * 0.05;
        precoFinal = produto - desconto;


        System.out.printf("O seu produto ficou no total de: R$ %.2f%n", precoFinal);

        sc.close();
    }
}



/* Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma 
condição.
Sintaxe:
( condição ) ? valor_se_verdadeiro : valor_se_falso */

// Usar quando for atribuir um valor simples em uma linha com base em uma condiçao verdadeiro ou falso