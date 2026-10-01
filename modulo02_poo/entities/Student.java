package modulo02_poo.entities;

public class Student {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    // Calcula a soma das notas
    public double NotaFinal() {
        return nota1 + nota2 + nota3;
    }

    public double PontosFaltando() {
        if (NotaFinal() < 60.0) {
            return 60.0 - NotaFinal();
        } else {
            return 0.0;
        }
    }

    public String toString() {
        String resultado = "Nota final = " + String.format("%.2f", NotaFinal()) + "\n";

        if (NotaFinal() >= 60.0) {
            resultado += "PASS";
        } else {
            resultado += "FAILED\nFALTARAM " 
                       + String.format("%.2f", PontosFaltando()) 
                       + " PONTOS";
        }

        return resultado;
    }
}
