package com.mycompany.atividade_27_08;
import java.util.Scanner;
public class Atv8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite o comprimento do primeiro lado do triangulo (em cm): ");
        double a = scanner.nextDouble();
        System.out.println("Digite o comprimento do segundo lado do triangulo (em cm): ");
        double b = scanner.nextDouble();
        System.out.println("Digite o comprimento do terceiro lado do triangulo (em cm): ");
        double c = scanner.nextDouble();
        
   
         if (a == b && b == c) {
            System.out.println("O triangulo é equilatero.");
        } else if (a == b || b == c || a == c) {
            System.out.println("O triangulo é isosceles.");
        } else {
            System.out.println("O triangulo é escaleno.");
        }
    }
}
