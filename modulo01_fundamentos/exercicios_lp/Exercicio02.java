/*  
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
casas decimais conforme exemplos. 
 
Fórmula da área: area = π . raio2 
 
Considere o valor de π = 3.14159  */

package modulo01_fundamentos.exercicios_lp;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor do raio do círculo: ");
        double r = sc.nextDouble();
        double area = Math.PI * Math.pow(r, 2);
        System.out.printf("A área do círculo é: %.4f%n", area);

        sc.close();
    }
}