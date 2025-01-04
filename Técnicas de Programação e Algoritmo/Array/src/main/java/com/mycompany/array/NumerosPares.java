package com.mycompany.array;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[100];
        int[] pares = new int[100];
        int contador = 0;

        System.out.println("Digite 100 números:");
        
        for (int i = 0; i < 100; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares[contador] = numero;
                contador++;
            }
        }
        
        System.out.println("\nNúmeros pares:");
        for (int i = 0; i < contador; i++) {
            System.out.println(pares[i]);
        }
    }
}
