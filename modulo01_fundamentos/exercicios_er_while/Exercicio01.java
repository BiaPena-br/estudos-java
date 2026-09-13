/* Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha 
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser 
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
*/

package modulo01_fundamentos.exercicios_er_while;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha;

        System.out.print("Digite sua senha: ");
        senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida!");
            System.out.print("Digite sua senha novamente: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido!");

        sc.close();
    }  
}
