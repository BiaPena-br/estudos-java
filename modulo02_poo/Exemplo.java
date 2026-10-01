/*
Fazer um programa para ler os dados de um produto em estoque(nome, preço e
quantidade no estoque). Em seguida:
•Mostrar os dados doproduto(nome,preço,quantidadenoestoque,valortotalno
estoque)
•Realizar uma entrada no estoque e mostrar novamente os dados do produto
•Realizar uma saída no estoque e mostrar novamente os dados do produto
*/

package modulo02_poo;

import java.util.Scanner;
import modulo02_poo.entities.Products;

public class Exemplo {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
        Products product = new Products();

        System.out.println("Enter product data: ");
        System.out.print("Nome: ");
        product.nome = sc.nextLine();
        System.out.print("Preço: ");
        product.preco = sc.nextDouble();
        System.out.print("Quantidade no estoque: ");
        product.quantidade = sc.nextInt();

        System.out.println();
        System.out.println("Dados do produto: " + product);

        System.out.println();
        System.out.print("Quantos produtos deseja adcionar ao estoque? ");
        int quantidade = sc.nextInt();
        product.entradaNoEstoque(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + product);

        System.out.println();
        System.out.print("Quantos produtos deseja remover do estoque? ");
        quantidade = sc.nextInt();
        product.saidaNoEstoque(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + product);

        sc.close();
    }
}