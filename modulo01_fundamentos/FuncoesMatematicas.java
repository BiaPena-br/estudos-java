package modulo01_fundamentos;


public class FuncoesMatematicas {
    public static void main(String[] args){
        double a = 10.0;
        double b = 2.0;
        double c = -5.0;
        double A, B, C;

        A = Math.sqrt(a); // Raiz quadrada
        B = Math.sqrt(b);
        C = Math.sqrt(20.0);
        System.out.println("Raiz quadrada de " + a + " = " + A);
        System.out.println("Raiz quadrada de " + b + " = " + B);
        System.out.println("Raiz quadrada de 20 = " + C);

        A = Math.pow(a, b); // Potência
        B = Math.pow(b, 2.0);
        C = Math.pow(c, 10.0);
        System.out.println(a + " elevado a " + b + " = " + A);
        System.out.println(b + " elevado a 2 = " + B);
        System.out.println(c + " elevado a 10 = " + C);

        A = Math.abs(a); // Valor absoluto(positivo)
        B = Math.abs(b);
        C = Math.abs(c);
        System.out.println("Valor absoluto de " + a + " = " + A);
        System.out.println("Valor absoluto de " + b + " = " + B);
        System.out.println("Valor absoluto de " + c + " = " + C);

    }
}
