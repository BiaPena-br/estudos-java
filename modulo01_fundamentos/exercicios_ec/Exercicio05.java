/* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
seguir, calcule e mostre o valor da conta a pagar. 

| CÓDIGO | ESPECIFICAÇÃO | PREÇO |
| :---: | :--- | :---: |
| 1 | Cachorro Quente | R$ 4.00 |
| 2 | X-Salada | R$ 4.50 |
| 3 | X-Bacon | R$ 5.00 |
| 4 | Torrada simples | R$ 2.00 |
| 5 | Refrigerante | R$ 1.50 |
*/


package modulo01_fundamentos.exercicios_ec;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double total;

        System.out.print("Qual produto você quer (Digite o código)? ");
        codigo = sc.nextInt();
        System.out.print("Quantos ítems você deseja? ");
        quantidade = sc.nextInt();

        if (codigo == 1) {
            total = quantidade * 4.0;
        }
        else if (codigo == 2) {
            total = quantidade * 4.50;
        }
        else if (codigo == 3) {
            total = quantidade * 5.00;
        }
        else if (codigo == 4) {
            total = quantidade * 2.00;
        }
        else {
            total = quantidade * 1.50;
        }

        System.out.printf("Seu total é: R$ %.2f", total);

        sc.close();
    }    
}
