package modulo01_fundamentos;

import java.util.Scanner; 

public class EstruturaCondSimp {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade = 10;

        System.out.println("Qual sua idade? ");
        idade = sc.nextInt();

        if (idade < 10) {      // o if checa a condição, se for verdadeira, executa o bloco de código dentro das chaves
            System.out.println("Você pode entrar no brinquedo!");
        }

        sc.close();


    }
}