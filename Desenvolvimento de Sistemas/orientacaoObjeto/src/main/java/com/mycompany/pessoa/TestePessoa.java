package com.mycompany.pessoa;

// Classe principal
public class TestePessoa {
    public static void main(String[] args) {
        
        //instancia de classe para criar objeto
        Aluno alu = new Aluno("Mimi", 16, "DS");
        
        // Exibe as informações do aluno
        alu.mostrarInfo(); 
        
        // Linha em branco para separar a saída
        System.out.println();  

        // Criando um objeto do tipo Professor
        Professor pro = new Professor("Carlos", 40, "Ciencia da Computacao");
        
        // Exibe as informações do professor
        pro.mostrarInfo();
    }
}
