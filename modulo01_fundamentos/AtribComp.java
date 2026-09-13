/* Uma operadora de telefonia cobra R$50.00 por um plano básico que
dá direito a 100 minutos de telefone. Cada minuto que exceder a
franquia de 100 minutos custa R$2.00. Fazer um programa para ler a
quantidade de minutos que uma pessoa consumiu,daí mostrar o valor
a ser pago. 
*/

package modulo01_fundamentos;

import java.util.Scanner;

public class AtribComp {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int minutos;
        double conta = 50.0;

        System.out.print("Quantos minutos você consumiu? ");
        minutos = sc.nextInt();

        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Sua fatura ficou no valor de R$ %.2f%n", conta);

        sc.close();
    }
}

// Usar o operador de atribuição cumulativa (Atribuição Composta) quando tem que atribuir a variável a ela mesma.