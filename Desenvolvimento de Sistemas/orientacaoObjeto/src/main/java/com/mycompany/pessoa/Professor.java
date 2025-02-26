package com.mycompany.pessoa;

// Subclasse Professor (herda de Pessoa)
class Professor extends Pessoa {
    
    // Atributo adicional para Professor
    String formacao;

    // Construtor da classe Professor
    public Professor(String nome, int idade, String formacao) {
        // Chama o construtor da superclasse Pessoa
        super(nome, idade);
        this.formacao = formacao;
    }

    // Sobrescreve o método mostrarInfo para adicionar a formação
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();  // Chama o método mostrarInfo da classe Pessoa
        System.out.println("Formação: " + formacao);
    }
}
