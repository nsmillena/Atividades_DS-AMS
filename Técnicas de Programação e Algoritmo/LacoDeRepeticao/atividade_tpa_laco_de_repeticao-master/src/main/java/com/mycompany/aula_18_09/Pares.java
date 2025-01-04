package com.mycompany.aula_18_09;
import java.util.Scanner;
public class Pares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int valorInicial = scanner.nextInt();

        System.out.print("Digite o valor final: ");
        int valorFinal = scanner.nextInt();

        int soma = 0;
        
        if (valorInicial > valorFinal) {
            System.out.println("Não é possível apresentar a soma dos números pares visto que o valor inicial desejado é maior que o valor final. Corrija e tente novamente.");
        }
        for (int i = valorInicial; i <= valorFinal; i++) {
            if (i % 2 == 0) {
                soma += i;
                System.out.println("A soma dos números pares entre " + valorInicial + " e " + valorFinal + " é: " + soma);
            }
        }
    }
}


