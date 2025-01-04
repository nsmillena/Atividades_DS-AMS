package com.mycompany.atividade_27_08;
import java.util.Scanner;
public class Atv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        System.out.print("Digite o seu peso corporal:");
        double peso = scanner.nextDouble();
        
        System.out.print("Digite a sua altura:");
        double altura = scanner.nextDouble();
      
        double imc = peso / (altura * altura);
       
        if (imc < 18) {
            System.out.println("Magreza - IMC=" + imc);
        } 
        else if (imc >= 18 && imc <= 24.9) {
            System.out.println("Saudável - IMC:" + imc);
        } 
        else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso - IMC:" + imc);
        } 
        else if (imc >= 30) {
            System.out.println("Obesidade - IMC:" + imc);
        }
      
    }
}
