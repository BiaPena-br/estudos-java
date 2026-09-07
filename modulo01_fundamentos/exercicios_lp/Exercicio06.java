/* 
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre:  
a) a área do triângulo retângulo que tem A por base e C por altura.  
b) a área do círculo de raio C. (pi = 3.14159)  
c) a área do trapézio que tem A e B por bases e C por altura.  
d) a área do quadrado que tem lado B.  
e) a área do retângulo que tem lados A e B.  */


package modulo01_fundamentos.exercicios_lp;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        System.out.print("Digite o valor de A: ");
        A = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        B = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        C = sc.nextDouble();

        areaTriangulo = (A * C) / 2;
        areaCirculo = Math.PI * Math.pow(C, 2);
        areaTrapezio = ((A + B) * C) / 2;
        areaQuadrado = Math.pow(B, 2);
        areaRetangulo = A * B;

        System.out.printf("""
            A área do Triângulo é: %.3f
            A área do Círculo é: %.3f
            A área do Trapézio é: %.3f
            A área do Quadrado é: %.3f
            A área do Retângulo é: %.3f""", areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);

        sc.close();
    }
    
}
