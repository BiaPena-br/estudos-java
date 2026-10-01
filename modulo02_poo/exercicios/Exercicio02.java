/*
Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em 
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o 
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é 
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe 
projetada abaixo.
*/

package modulo02_poo.exercicios;

import java.util.Scanner;
import modulo02_poo.entities.Funcionario;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Nome: ");
        funcionario.nome= sc.nextLine();
        System.out.print("Salário Bruto: ");
        funcionario.salariobruto = sc.nextDouble();
        System.out.print("Imposto: ");
        funcionario.imposto = sc.nextDouble();

        System.out.println();
        System.out.println(funcionario);

        System.out.println();
        System.out.print("Digite a porcentagem para aumentar o salário: ");
        double porcentagem = sc.nextDouble();
        funcionario.AumentarSalario(porcentagem);

        System.out.println();
        System.out.println(funcionario);

        sc.close();
    }
    
}
