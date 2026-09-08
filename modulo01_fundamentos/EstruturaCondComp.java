package modulo01_fundamentos;

import java.util.Scanner;

public class EstruturaCondComp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horario;

        System.out.println("Quantas horas? ");
        horario = sc.nextInt();

        if (horario < 12) {
            System.out.println("Bom dia!");    
        }
        else {
            System.out.println("Boa tarde!");

        }

        sc.close();
    }
}