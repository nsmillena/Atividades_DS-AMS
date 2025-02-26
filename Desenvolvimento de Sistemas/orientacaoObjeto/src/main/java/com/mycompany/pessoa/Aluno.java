package com.mycompany.pessoa;
// Subclasse Aluno (herda de Pessoa)
class Aluno extends Pessoa {
    // Atributo adicional para Aluno
    String curso;

    // Construtor da classe Aluno
    public Aluno(String nome, int idade, String curso) {
        
        // Chama o construtor da superclasse Pessoa
        super(nome, idade);
        this.curso = curso;
    }

    // Sobrescreve o método mostrarInfo para adicionar o curso
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();  // Chama o método mostrarInfo da classe Pessoa
        System.out.println("Curso: " + curso);
    }
}

