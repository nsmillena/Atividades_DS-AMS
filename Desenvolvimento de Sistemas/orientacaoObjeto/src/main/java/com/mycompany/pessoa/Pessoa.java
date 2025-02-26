package com.mycompany.pessoa;
// Superclasse Pessoa
class Pessoa {
    // Atributos comuns a todas as pessoas
    String nome;
    int idade;

    // Construtor da classe Pessoa
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para exibir as informações da pessoa
    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

