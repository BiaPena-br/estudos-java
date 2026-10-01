package modulo02_poo.entities;

public class Retangulo {
    public double altura;
    public double largura;

    public double area() {
        return altura * largura;
    }

    public double perimetro () {
        return 2 * (altura + largura);
    }

    public double diagonal() {
        return Math.sqrt(altura * altura + largura * largura);
    }

    public String toString() {
        return "ÁREA = " 
        + String.format("%.2f", area())
        + "\nPERÍMETRO = "
        + String.format("%.2f", perimetro())
        + "\nDIAGONAL = "
        + String.format("%.2f", diagonal());
    }
}
