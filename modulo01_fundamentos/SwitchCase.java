package modulo01_fundamentos;

import java.util.Scanner;

public class SwitchCase {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        String dia;

        System.out.print("Digite um número de 1 a 7 para descobrir o dia da semana: ");
        numero = sc.nextInt();

        switch (numero) {
        case 1:
            dia = "Domingo";
            break;            // sempre tem que colocar break no fim do bloco de código.
        case 2:
            dia = "Segunda";
            break;
        case 3:
            dia = "Terça";
            break;
        case 4:
            dia = "Quarta";
            break;
        case 5:
            dia = "Quinta";
            break;
        case 6:
            dia = "Sexta";
            break;
        case 7:
            dia = "Sábado";
            break;
        default:
            dia = "Valor inválido";
            break;
        }

        System.out.println("Dia da semana:" + dia);

        sc.close();
    }

}

// Use switch case quando tem uma variável e deseja compará-la com vários valores fixos.
