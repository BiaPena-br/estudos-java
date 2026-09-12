/* 
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em 
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”. 
*/

package modulo01_fundamentos.exercicios_ec;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor;

        System.out.print("Digite um número: ");
        valor = sc.nextDouble();

        if (valor < 0.0 || valor > 100.0) {
            System.out.printf("%.2f está fora do intervalo!", valor);
        }
        else if (valor <= 25.0) {
            System.out.printf("%.2f está entre o intervalo (0, 25)!", valor);
        }
        else if (valor <= 50.0) {
            System.out.printf("%.2f está entre o intervalo (25, 50)!", valor);
        }
        else if (valor <= 75.0 ) {
            System.out.printf("%.2f está entre o intervalo (50, 75)!", valor);
        }
        else {
            System.out.printf("%.2f está entre o intervalo (75, 100)!", valor);
        }

        sc.close();
    }
}