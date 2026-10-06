/*
Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano 
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no 
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam 
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para 
resolver este problema.
*/

package modulo02_poo.exercicios;

import java.util.Scanner;
import modulo02_poo.entities.Student;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student estudante = new Student();

        System.out.print("Digite seu nome: ");
        estudante.nome = sc.nextLine();
        System.out.print("Digite suas notas obtidas nos três trimestres: ");
        estudante.nota1 = sc.nextDouble();
        estudante.nota2 = sc.nextDouble();
        estudante.nota3 = sc.nextDouble();

        System.out.println();
        System.out.println(estudante);

        sc.close();
    }  
}
