/*  
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema 
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo 
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).  
*/


package modulo01_fundamentos.exercicios_er_while;


import java.util.Scanner; 

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int x, y;

        System.out.print("Digite a coordenada de X e Y: ");
            x = sc.nextInt();
            y = sc.nextInt();

        while (x != 0  && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro quadrante!");
            }
            else if (x < 0 && y > 0) {
                System.out.println("Segundo quadrante!");
            }
            else if (x < 0 && y < 0) {
                System.out.println("Terceiro quadrante!");
            }
            else {
                System.out.println("Quarto quadrante!");
            }
            System.out.print("Digite a coordenada de X e Y: ");
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}

/* ORIGEM : X E Y == O
   PRIMEIRO QUADRANTE : X E Y > 0
   SEGUNDO QUADRANTE : X  < 0 E Y > 0
   TERCEIRO QUADRANTE : X E Y < 0
   QUARTO QUADRANTE : X > 0 E Y < 0
*/
