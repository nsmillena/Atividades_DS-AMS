package com.mycompany.produto;
public class TesteProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setPreco(50.75);  // Definindo o preço do produto para 50.75
        System.out.println("Preço do produto: R$ " + produto.getPreco());  // Obtendo o preço
    }
}
