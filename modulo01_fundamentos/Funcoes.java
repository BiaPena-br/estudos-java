package modulo01_fundamentos;

import java.util.Scanner;

public class Funcoes{
    public static void main(String[] args) { //public fala que o método é acessível de fora da classe.
                                            // static fala que o método pertence a classe
                                            // void é vazio = método não retorna nenhum valor.
                                            // main é o método que o JVM procura para executar.
                                            // String[] args — parâmetro que recebe argumentos passados via linha de comando.
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Digite três valores inteiros: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int higher = max(a, b, c);
        showResult(higher);
        sc.close();

    }
    public static int max(int a, int b, int c) {
        int aux;
        if (a > b && a > c) {
            aux = a;
        }
        else if (b > c) {
            aux = b;
        }
        else {
            aux = c;
        }
        return aux;
    }
    public static void showResult(int higher) {
        System.out.println("Higher = " + higher);
    }
}