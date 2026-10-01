package modulo02_poo.entities;

public class Funcionario {
    public String nome;
    public double salariobruto;
    public double imposto;

    public double SalarioLiquido() {
        return salariobruto - imposto;
    }

    public void AumentarSalario(double porcentagem) {
        salariobruto += (salariobruto * porcentagem / 100.0);
    }

    public String toString() {
        return "Funcionário: "
        + nome
        + ", $ "
        + String.format("%.2f", SalarioLiquido());
    }
}
