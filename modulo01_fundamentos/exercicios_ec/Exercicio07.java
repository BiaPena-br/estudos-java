/*  
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). 
 
Se o ponto estiver na origem, escreva a mensagem “Origem”. 
 
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a 
situação. 
*/


package modulo01_fundamentos.exercicios_ec;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.print("Digite um valor decimal: ");
        x = sc.nextDouble();
        System.out.print("Digite outro valor decimal: ");
        y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.print("Origem");
        }
        else if (x == 0.0) {
            System.out.print("Eixo y");
        }
        else if (y == 0.0) {
            System.out.print("Eixo x");
        }
        else if (x > 0.0 && y > 0.0) {
            System.out.print("Quadrante 1");
        }
        else if ( x < 0.0 && y > 0.0) {
            System.out.print("Quadrante 2");
        }
        else if (x < 0.0 && y < 0.0) {
            System.out.print("Quadrante 3");
        }
        else {
            System.out.print("Quadrante 4");
        }

        sc.close();
    }
    
}
