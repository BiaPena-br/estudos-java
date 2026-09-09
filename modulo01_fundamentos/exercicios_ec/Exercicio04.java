/*  
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. 
*/


package modulo01_fundamentos.exercicios_ec;

import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horaIni, horaFim, duracao;

        System.out.print("Que horas você começou o jogo? ");
        horaIni = sc.nextInt();
        System.out.print("Que horas você terminou o jogo? ");
        horaFim = sc.nextInt();


        if (horaIni < horaFim) {
            duracao = horaFim - horaIni;
        }
        else {
            duracao = (24 - horaIni) + horaFim;
        }

        System.out.printf("O seu jogo teve duraçao de: %d hora(s)", duracao);
        
        sc.close();
    }
}
