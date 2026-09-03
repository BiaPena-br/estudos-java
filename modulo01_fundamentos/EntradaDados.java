package modulo01_fundamentos;

import java.util.Scanner; // classe usada para ler dados do usuário.
import java.util.Locale; // classe usada para definir o padrão de entrada e saída de dados.

public class EntradaDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // uso o locale para definir o padrão de entrada e saída de dados, nesse caso, o padrão americano.
        Scanner sc = new Scanner(System.in);

        String a;
        int b;
        char c;
        double d;
        String e;

        a = sc.next(); //lê uma palavra (strings sem espaço).
        b = sc.nextInt(); //lê inteiros.
        c = sc.next().charAt(0); //lê char.
        d = sc.nextDouble(); //lê double.
        sc.nextLine(); //limpa o buffer do scanner, pois o próximo comando é para ler uma linha inteira.
        e = sc.nextLine(); //lê uma linha inteira (strings com espaço).

        System.out.println("Os dados digitados são: " + a + " , " + b + " , " + c + " , " + d + " , " + e);

        sc.close(); // sempre fechar o scanner no final do programa para liberar os recursos.
    }
}
