package com.mycompany.carro;

//define a classe
class Carro {
    
    //atributos
    String cor;
    String modelo;
    String motor;
    
    //métodos que enão recebem parâmetros e não retornam valor, apenas executam ação
    void ligar(){
        System.out.println("Ligando carro");
    }
    void desligar(){
        System.out.println("Desligando o carro");
    }
    void acelerar(){
        System.out.println("Acelerando o carro");
      }
    void brecar(){
        System.out.println("Brecando o carro");
    }
    void mudarMarcha(){
        System.out.println("Marcha engatada");
    }
}
