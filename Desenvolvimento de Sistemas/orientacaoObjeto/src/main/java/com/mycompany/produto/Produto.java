package com.mycompany.produto;
public class Produto {
    private double preco;  // Atributo privado

    // Método get para acessar o preço
    public double getPreco() {
        return preco;
    }

    // Método set para modificar o preço
    public void setPreco(double preco) {
        if (preco >= 0) {  // Verifica se o preço é válido (não negativo)
            this.preco = preco;
        } else {
            System.out.println("Preço inválido! O preço não pode ser negativo.");
        }
    }
}
