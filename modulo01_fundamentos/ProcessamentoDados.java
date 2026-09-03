package modulo01_fundamentos;

public class ProcessamentoDados {
    public static void main(String[] args){
        int x, y;
        double resultado;

        x = 5;
        y = 2;
        resultado = (double) x / y;

    System.out.println("O resultado da divisão é: " + resultado);
    }
}

/* quando se tem dois números inteiros, o resultado da divisão será um número inteiro. 
Para obter um resultado decimal, é necessário fazer um cast para double em pelo menos um dos números antes da divisão.*/

/* O processamento de dados ocorre através da atribuição de valores às variáveis e da execução de operações matemáticas, como a divisão. 
O resultado é então armazenado em uma variável do tipo apropriado (neste caso, double) para garantir que o valor decimal seja preservado. */