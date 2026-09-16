/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. 
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo). 
*/

package modulo01_fundamentos.exercicios_er_for;

import java.util.Scanner; 

public class Exercicio02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N, X, i;
        int in = 0;
        int out = 0;

        System.out.print("Digite um valor inteiro: ");
        N = sc.nextInt();

        for(i=0; i<N; i++) {

            X = sc.nextInt();

            if(X >= 10 && X <= 20) {
                in++;
            }
            else {
                out++;
            }
        }
        System.out.printf("%d in%n", in);
        System.out.printf("%d out", out);

        sc.close();
    }
    
}
