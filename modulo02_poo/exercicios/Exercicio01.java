/* 
Fazer um programa para ler os valores da largura e altura 
de um retângulo. Em seguida, mostrar na tela o valor de 
sua área, perímetro e diagonal. Usar uma classe como 
mostrado no projeto ao lado.
*/

package modulo02_poo.exercicios;

import java.util.Scanner;
import modulo02_poo.entities.Retangulo;

public class Exercicio01  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.print("Digite a  largura e a altura do retângulo: ");
        retangulo.largura = sc.nextDouble();
        retangulo.altura = sc.nextDouble();

        System.out.println(retangulo);
    
        sc.close();
    }
}
