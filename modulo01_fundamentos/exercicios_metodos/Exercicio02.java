/*
Exercício 2: Calculadora de Média
Crie um método chamado calcularMedia que recebe três notas (tipo double) e retorna a média aritmética simples dessas notas. 
*/

package modulo01_fundamentos.exercicios_metodos;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.println("Digite suas notas nessa máteria: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double resultado = calcularMedia(a, b, c);
        showResultado(resultado);

        sc.close();
    }
    public static double calcularMedia(double a, double b, double c) {
        double media = (a+b+c) / 3;
        return media;
    }
    public static void showResultado(double resultado) {
        System.out.println("A média das suas notas é: " + resultado);
    }
}
