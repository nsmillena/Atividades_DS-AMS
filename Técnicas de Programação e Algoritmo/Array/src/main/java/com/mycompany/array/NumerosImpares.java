package com.mycompany.array;
import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[100];
        int[] impares = new int[100];
        int contador = 0;

        System.out.println("Digite 100 números:");
        
        for (int i = 0; i < 100; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                impares[contador] = numero;
                contador++;
            }
        }
        
        System.out.println("\nNúmeros ímpares:");
        for (int i = 0; i < contador; i++) {
            System.out.println(impares[i]);
        }
    }
}
