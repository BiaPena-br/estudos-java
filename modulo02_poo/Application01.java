/*
Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas).Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área. SEM POO.
*/

package modulo02_poo;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.print("Digite as medidas do triângulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.print("Digite as medidas do triângulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p-xA) * (p-xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p-yA) * (p-yB) * (p - yC));

        System.out.println("Área do triângulo X:" + " " + areaX );
        System.out.println("Área do triângulo Y:" + " " + areaY );

        if (areaX > areaY) {
            System.out.println("Maior área: X");
        }
        else {
            System.out.println("Maior área: Y");
        }

        sc.close();
    }
}