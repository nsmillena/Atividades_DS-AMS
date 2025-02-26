package com.mycompany.carro;
//ponto de entrada onde o main será executado
public class ExemploCarro {

    //public = modificador de acesso
    //static = método estático, pertence à classe e não ao objeto. Quando executado, não cria um objeto para chamá-lo 
    //void = retorno do método main vazio
    //(String[] args) = parâmetro é um vetor de objetos do tipo String. 
    public static void main(String[] args) {
        
        //instancia de classe para criar objeto
        Carro umCarro = new Carro();
        
         //atributos do objeto 
        umCarro.modelo = "Gol";
        umCarro.cor = "preto";
        umCarro.motor = "1.0";
        
        //exibe os atributos do objeto
        System.out.println(umCarro.modelo);
        System.out.println(umCarro.cor);
        System.out.println(umCarro.motor);
        
        //chama métodos definidos na classe Carro para realizar ações com o objeto "umCarro"
        umCarro.ligar();
        umCarro.mudarMarcha();
        umCarro.acelerar();
        umCarro.brecar();
        umCarro.desligar();
        
        //atribui "umCarro" a null, o objeto não será mais referenciado, libera memória
        umCarro = null;
    }
}
   