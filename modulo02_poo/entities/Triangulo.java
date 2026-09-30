package modulo02_poo.entities;

public class Triangulo {
    
    public double a; // Atributo são as características, propriedades ou variáveis que pertencem à classe. Definem o estado do elemento.
    public double b;
    public double c;

    public double area() { // Métodos são as ações, comportamentos ou funções que o molde pode executar. Definem o que o elemento faz.
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

/*
Triângulo é uma entidade com três atributos (a, b, c), para evitar de usar três variáveis distintas para representar
cada triângulo, cria-se uma classe que vai representa-lo.

Os métodos criados nas classes evitam a redundância de códigos e delega responsabilidades a tal classe.

A classe é como se fosse um molde, modelo ou uma receita, não existindo concretamente no mundo real, apenas define
como as coisas devem ser estruturadas.
*/