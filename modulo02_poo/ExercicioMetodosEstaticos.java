package modulo02_poo;

import java.util.Scanner;
import modulo02_poo.util.CurrencyConverter;  // Usei pacote util porque é uma ferramneta reutilizável e não uma entidade do sistema.

public class ExercicioMetodosEstaticos {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o preço do dolar hoje? ");
        double preco = sc.nextDouble();
        System.out.print("Quantos dolares você vai comprar? ");
        double valor = sc.nextDouble();

        System.out.printf("Valor a ser pago em reais: %.2f%n", CurrencyConverter.dollarToReal(valor, preco)); // como a classe CurrencyConverter é estática, não é necessário instanciar um objeto para chamar o método dollarToReal.
    }
}
