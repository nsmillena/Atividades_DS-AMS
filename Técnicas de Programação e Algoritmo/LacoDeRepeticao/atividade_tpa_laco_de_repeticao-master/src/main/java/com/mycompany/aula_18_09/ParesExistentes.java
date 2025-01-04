package com.mycompany.aula_18_09;
import java.util.Scanner;
public class ParesExistentes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        if (numero1 > numero2) {
            System.out.println("Erro: O primeiro número é maior que o segundo.");
        } else {
            System.out.println("Números pares entre " + numero1 + " e " + numero2 + ":");

            for (int i = numero1; i <= numero2; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}


 

