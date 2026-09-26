/*
Exercício 3: Inversor de Texto
Crie um método chamado inverterString que recebe uma String como parâmetro e retorna essa mesma String escrita ao contrário (exemplo: ao passar "Java", deve retornar "avaJ").
*/

package modulo01_fundamentos.exercicios_metodos;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a;

        System.out.print("Digite uma palavra: ");
        a = sc.next();

        String b = inverterString(a);
        showResult(a, b);

        sc.close();
    }
    public static String inverterString(String a) {
        return new StringBuilder(a).reverse().toString();
    }
    public static void showResult(String a, String b) {
        System.out.println(a + " " + "ao contrário é: " + b);
    }

}
