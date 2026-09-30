/*
Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas).Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área. COM POO.
*/


package modulo02_poo;

import java.util.Scanner;
import modulo02_poo.entities.Triangulo;

public class Application02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangulo x, y;  // variável de ref x e y do tipo Triangulo.
        x = new Triangulo(); // constrói um objeto real na memória e manda x apontar pra ele.
        y = new Triangulo();

        System.out.print("Digite as medidas do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.print("Digite as medidas do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area(); // chama o método criado na classe
        double areaY = y.area();

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
                System.out.println("Maior área: X");
        }
        else {
            System.out.println("Maior área: Y");
        }
        
        sc.close();
    }
}


/* Objeto é a criação concreta feita a partir do molde (da classe). Quando você usa a palavra new, 
o Java aloca memória e constrói um objeto real que possui seus próprios valores nos atributos.*/
// INSTANCIAÇÃO = ALOCAÇÃO DINÂMICA DE MEMÓRIA.