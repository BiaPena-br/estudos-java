/*  
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais. 
*/


package modulo01_fundamentos.exercicios_lp;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numFunc, horasTrab, valorHora;
        double salario;

        System.out.println("Digite o número do funcionário: ");
        numFunc = sc.nextInt();
        System.out.println("Digite o número de horas trabalhadas: ");
        horasTrab = sc.nextInt();
        System.out.println("Digite o valor recebido por hora trabalhada:");
        valorHora = sc.nextInt();

        salario = horasTrab * valorHora;

        System.out.printf("O número do funcionário é: %d %nSeu salário é: R$ %.2f%n", numFunc, salario);

        sc.close();
    }
}

