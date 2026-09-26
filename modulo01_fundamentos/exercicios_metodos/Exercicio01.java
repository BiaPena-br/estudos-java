/* 
Exercício 1: Validador de Número Par
Crie um método chamado ehPar que recebe um número inteiro (int) como parâmetro e retorna um valor booleano (boolean) indicando se o número é par ou não. 
*/

package modulo01_fundamentos.exercicios_metodos;

import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Digite um valor inteiro: ");
        x = sc.nextInt();

        boolean result = ehPar(x);

        if (result) {
            System.out.println("O número " + x + " " + "é par!");
        }
        else {
            System.out.println("O número " + x + " " + "é ímpar!");
        }

        sc.close();
    }
    public static boolean ehPar (int x) {
        return x % 2 == 0;
    }
}
