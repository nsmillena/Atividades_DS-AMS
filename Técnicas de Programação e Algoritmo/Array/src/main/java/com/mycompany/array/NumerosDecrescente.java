package com.mycompany.array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NumerosDecrescente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] numeros = new Integer[50]; // Usando Integer em vez de int

        System.out.println("Digite 50 números:");
        for (int i = 0; i < 50; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        Arrays.sort(numeros, Collections.reverseOrder());

        System.out.println("\nNúmeros em ordem decrescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
